public class AppointmentBook {
    private boolean[][] schedule; 
    
    public AppointmentBook(boolean[][] schedule){
        this.schedule = schedule; 
    }

    private boolean isMinuteFree(int period, int minute) {
        return schedule[period-1][minute]; 
    }

    
    private void reserveBlock(int period, int startMinute, int duration) {
        for (int i=startMinute; i<duration; i++){
            schedule[period-1][i]=false; 
        }
    }

    
    public int findFreeBlock(int period, int duration) {
        int timeFree = 0; 
        int firstFree = 0; 
        for (int i = 0; i<schedule[period-1].length; i++){
            if (isMinuteFree(period, i) && timeFree == 0){
                firstFree = i; 
                timeFree++; 
            }
            else if (isMinuteFree(period, i)){
                timeFree++; 
            }
            else{
                timeFree = 0; 
            }
            if (timeFree>=duration){
                return firstFree; 
            }
        }

        return -1; 
    }

    
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        int[] freeBlock = {-1, 0}; 
        for (int o=startPeriod; o<=endPeriod; o++){
            if (freeBlock[0]==-1 && findFreeBlock(o, duration)!=-1){
                freeBlock[0]=o; 
                freeBlock[1]=findFreeBlock(o, duration); 
                reserveBlock(o, freeBlock[1], duration);
                return true; 
            }
        }
        return false; 
    }

    public void printPeriod(int period){
        for (int i = 0; i<schedule[period-1].length; i++){
            System.out.println(i + " " + schedule[period-1][i]);
        }
    }

}



