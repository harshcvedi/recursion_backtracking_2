public static boolean canPaintAllBoards(int[] boardLengths, int numPainters, int timeLimit) {
    int totalLength = 0;
    int currentWorkload = 0;
    
    for (int i = 0; i < boardLengths.length; i++) {
        if (boardLengths[i] > timeLimit) {
            return false;
        }
        
        if (currentWorkload + boardLengths[i] <= timeLimit) {
            currentWorkload += boardLengths[i];
        } else {
            totalLength += currentWorkload;
            currentWorkload = boardLengths[i];
            
            if (totalLength + currentWorkload > timeLimit) {
                return false;
            }
        }
    }
    
    totalLength += currentWorkload;
    return numPainters >= boardLengths.length || totalLength <= timeLimit;
}

public static int minTimeToPaintBoards(int[] boardLengths, int numPainters) {
    int lo = 0;
    int hi = 0;
    
    for (int length : boardLengths) {
        hi += length;
    }
    
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        
        if (canPaintAllBoards(boardLengths, numPainters, mid)) {
            hi = mid;
        } else {
            lo = mid + 1;
        }
    }
    
    return lo;
}
