public class Door extends CarComponent{
    private boolean isOpen;
    public boolean windowsOpen;
    private boolean isLocked;
    private int tintPercentage;
    
    public Door(boolean isOpen, int tintPercentage, boolean isLocked, boolean isWorking, String nameOfComponent) {
        super(nameOfComponent, isWorking);
        this.setIsOpen(isOpen);
        this.setTintPercentage(tintPercentage);
        this.setIsLocked(isLocked);
    }
    
    public String lockUp() {
        if((Math.random() * 100) + 1 < 20){
            return damage();
        }else{
            setIsLocked(true);
            setIsOpen(false);
            windowsOpen = false;
            return "The door is now locked, closed, and the windows are closed";
        }
    }
    public String openUp() {
        if((Math.random() * 100) + 1 < 20){
            return damage();
        }else{
            setIsLocked(false);
            setIsOpen(true);
            windowsOpen = true;
            return "The door is now open, unlocked, and the windows are down";
        }
    }
    
    @Override
    public boolean action1() {
         lockUp();
         return getIsWorking();
    }
    
    @Override
    public boolean action2() {
        openUp();
        return getIsWorking();
    }
    
    @Override
    public String damage() {
        setIsWorking(false);
        return "The " + getNameOfComponent() + " is no longer working";
    }
    
    @Override
    public String fix() {
        if(getIsWorking()) {
            return "The " + getNameOfComponent() + " is already working";
        }else {
            return super.fix() + "The " + getNameOfComponent() + " is now working";
        }
    }
    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    
    public boolean getWindowsOpen() {
        return windowsOpen;
    }
    
    public void setWindowsOpen(boolean windowsOpen) {
        this.windowsOpen = windowsOpen;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public int getTintPercentage() {
        return tintPercentage;
    }

    public void setTintPercentage(int tintPercentage) {
        this.tintPercentage = tintPercentage;
    }
    
    
}

//OLD CODE BELOW

// public class Door extends CarComponent{
//     private boolean isOpen;
//     public boolean windowsOpen;
//     private boolean isLocked;
//     private int tintPercentage;
    
//     public Door(boolean isOpen, int tintPercentage, boolean isLocked, boolean isWorking, String nameOfComponent) {
//         super(nameOfComponent, isWorking);
//         this.setIsOpen(isOpen);
//         this.setTintPercentage(tintPercentage);
//         this.setIsLocked(isLocked);
//     }
    
//     public String lockUp() {
//         if((Math.random() * 100) + 1 < 20){
//             return damage();
//         }else{
//             setIsLocked(true);
//             setIsOpen(false);
//             windowsOpen = false;
//             return "The door is now locked, closed, and the windows are closed";
//         }
//     }
//     public String openUp() {
//         if((Math.random() * 100) + 1 < 20){
//             return damage();
//         }else{
//             setIsLocked(false);
//             setIsOpen(true);
//             windowsOpen = true;
//             return "The door is now open, unlocked, and the windows are down";
//         }
//     }
    
//     @Override
//     public String action1() {
//         return lockUp();
//     }
    
//     @Override
//     public String action2() {
//         return openUp();
//     }
    
//     @Override
//     public String damage() {
//         setIsWorking(false);
//         return "The " + getNameOfComponent() + " is no longer working";
//     }
    
//     @Override
//     public String fix() {
//         if(getIsWorking()) {
//             return "The " + getNameOfComponent() + " is already working";
//         }else {
//             return super.fix() + "The " + getNameOfComponent() + " is now working";
//         }
//     }
//     public boolean getIsOpen() {
//         return isOpen;
//     }

//     public void setIsOpen(boolean isOpen) {
//         this.isOpen = isOpen;
//     }
    
//     public boolean getWindowsOpen() {
//         return windowsOpen;
//     }
    
//     public void setWindowsOpen(boolean windowsOpen) {
//         this.windowsOpen = windowsOpen;
//     }

//     public boolean getIsLocked() {
//         return isLocked;
//     }

//     public void setIsLocked(boolean isLocked) {
//         this.isLocked = isLocked;
//     }

//     public int getTintPercentage() {
//         return tintPercentage;
//     }

//     public void setTintPercentage(int tintPercentage) {
//         this.tintPercentage = tintPercentage;
//     }
    
    
// }