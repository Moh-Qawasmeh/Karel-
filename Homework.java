import stanford.karel.SuperKarel;

public class Homework extends SuperKarel {
    private int moves = 0;

    public void run() {
        moves = 0;
        int NumberOfColumns = Transformation(true, false, false) + 1;
        int NumberOfRows = Transformation(true, false, false) + 1;

        if (NumberOfColumns == 1 || NumberOfRows == 1) {
            if (NumberOfRows > 2 || NumberOfColumns > 2) {
                int MAX = (NumberOfColumns > NumberOfRows ? NumberOfColumns : NumberOfRows);
                if (MAX == NumberOfRows) turnLeft();
                if (MAX < 6) {
                    int counter = 0;
                    while (!frontIsBlocked()) {
                        counter++;
                        Move(0, 0, 0, 0);
                        if (counter == MAX / 2) PUT();
                        if (MAX % 2 == 0 && counter + 1 == MAX / 2) PUT();
                    }
                } else {
                    if ((MAX % 4 == 2 || MAX % 4 == 3) && MAX != 6) {
                        if (MAX % 4 == 2) PUT();
                        Move(0, 0, 0, 0);
                        if(MAX % 4 == 3){
                            for(int i = 0; i < (MAX / 4) - 1; i++)
                                Move(0,0,0,0);
                        }
                        MAX--;
                    }
                    int steps = (MAX - 2) / 4, counter = steps;
                    if (MAX == 6) steps = 1;
                    for (int i = 0; i < MAX - 1; i++) {
                        if (counter == steps) {
                            PUT();
                            counter = 0;
                        } else counter++;
                        Move(0, 0, 0, 0);
                    }
                     PUT();
                }
            }
        } else if (NumberOfColumns == 2 || NumberOfRows == 2) {
            if (NumberOfRows < 5 && NumberOfColumns == 2) ZigZag(NumberOfRows, 0);
            else if (NumberOfColumns < 5 && NumberOfRows == 2) ZigZag(0, NumberOfColumns);
            else if (NumberOfRows < 7 && NumberOfColumns == 2) {
                Move(1, 0, 0, 0);
                Move(1, 1, 0, 0);
                if (NumberOfRows == 5) {
                    Move(0, 1, 0, 0);
                    turnAround();
                } else {
                    Move(1, 1, 0, 0);
                    Move(1, 0, 1, 0);
                    turnRight();
                }
                ZigZag(4, 0);
            } else if (NumberOfColumns < 7 && NumberOfRows == 2) {
                Move(1, 1, 0, 0);
                Move(1, 0, 1, 0);
                if (NumberOfColumns == 5) {
                    Move(0, 0, 1, 0);
                    turnLeft();
                } else {
                    Move(1, 0, 1, 0);
                    Move(1, 1, 0, 0);
                }
                ZigZag(0, 4);
            } else {
                if (NumberOfColumns < NumberOfRows) {
                    if (NumberOfRows % 2 == 0) {
                        int steps = (NumberOfRows - 4) / 4;
                        if (NumberOfRows % 4 == 0)
                            Move(0, 0, 0, 0);
                        else {
                            Move(1, 0, 0, 0);
                            Move(1, 1, 0, 0);
                            Move(1, 1, 0, 0);
                            Move(1, 0, 0, 1);
                            Move(0, 1, 0, 0);
                        }
                        WalkAndPut(steps, NumberOfRows, 1);
                    } else {
                        int steps = (NumberOfRows - 2) / 4;
                        if (NumberOfRows % 4 == 3) {
                            Move(0, 0, 0, 0);
                            Move(0, 1, 0, 0);
                            for (int i = 0; i < steps - 1; i++)
                                Move(0, 0, 0, 0);
                        } else {
                            Move(0, 0, 0, 0);
                            turnLeft();
                        }
                        WalkAndPut(steps, NumberOfRows, 1);
                    }
                } else {
                    if (NumberOfColumns % 2 == 0) {
                        int steps = (NumberOfColumns - 4) / 4;
                        if (NumberOfColumns % 4 == 0) {
                            Move(1, 1, 0, 0);
                            Move(1, 0, 0, 1);
                        } else {
                            Move(1, 1, 0, 0);
                            Move(1, 0, 1, 0);
                            Move(1, 0, 1, 0);
                            PUT(); turnLeft();
                            Move(0, 0, 0, 0);
                        }
                        WalkAndPut(steps, NumberOfColumns, 0);
                    } else {
                        int steps = (NumberOfColumns - 2) / 4;
                        if (NumberOfColumns % 4 == 3) {
                            for (int i = 0; i < steps; i++)
                                Move(0, 0, 0, 0);
                        }
                        WalkAndPut(steps, NumberOfColumns, 0);
                    }
                }
            }
        } else if (NumberOfColumns == NumberOfRows && NumberOfColumns % 2 == 0) {
           diagonal();
        } else if ((NumberOfColumns % 2 == 0) && (NumberOfRows % 2 == 0)) {
            for (int i = 0; i < NumberOfColumns / 2 - 1; i++)
                Move(0, 0, 0, 0);
            Move(1, 0, 0, 0);
            LeftRightMove(NumberOfRows / 2, 0);
            if (notFacingEast()) turnAround();
            Transformation(true, false, true);
            Move(0, 0, 0, 0);
            turnLeft();
            if (NumberOfRows % 2 == 0) PUT();
            Transformation(true, false, (NumberOfRows % 2 == 0) ? true : false);
            Move(0, 0, 0, 0);
            PUT();
            turnLeft();
            for (int i = 0; i < NumberOfColumns / 2; i++)
                Move(1, 0, 0, 0);
            PUT();
            Move(0, 0, 0, 1);
            LeftRightMove(NumberOfRows / 2, (NumberOfRows % 2 == 0) ? 1 : 0);
            if (NumberOfRows % 4 != 0) {
                turnRight();
                turnLeft();
            } else turnAround();
            Move(1, 0, 0, 0);
            Transformation(false, false, false);
        } else {
            if (NumberOfRows % 2 == 1 && NumberOfColumns % 2 == 1 || (NumberOfRows == NumberOfColumns && NumberOfColumns % 2 == 1)) {
                for (int i = 0; i < NumberOfColumns / 2; i++) Move(0, 0, 0, 0);
                turnLeft();
                for (int i = 0; i < NumberOfRows / 2; i++) Move(1, 0, 0, 0);
                turnLeft();
                for (int i = 0; i < NumberOfColumns / 2; i++) Move(1, 0, 0, 0);
                turnAround();
                for (int i = 0; i < NumberOfColumns - 1; i++) Move(1, 0, 0, 0);
                turnAround();
                for (int i = 0; i < NumberOfColumns / 2; i++) Move(1, 0, 0, 0);
                turnRight();
                for (int i = 0; i < NumberOfRows / 2; i++) Move(1, 0, 0, 0);
                turnRight();
                PUT();
                for (int i = 0; i < NumberOfColumns / 2; i++) Move(0, 0, 0, 0);
            } else if (NumberOfRows % 2 == 1) {
                for (int i = 0; i < NumberOfColumns / 2; i++) Move(0, 0, 0, 0);
                PUT(); turnLeft();
                int u = ((NumberOfRows - 1) / 2 + 1) / 2;
                for (int i = 0; i < u - 1; i++) Move(1, 0, 0, 0);
                PUT(); turnLeft();
                Move(0, 0, 0, 0);
                turnRight();
                if ((NumberOfRows - 1) % 4 == 0)
                    Move(0, 0, 0, 0);
                for (int i = 0; i < u; i++)
                    Move(1, 0, 0, 0);
                PUT();
                turnLeft();
                while (!frontIsBlocked())
                    Move(1, 0, 0, 0);
                turnAround();
                while (!frontIsBlocked())
                    Move(1, 0, 0, 0);
                turnAround();
                PUT();
                for (int i = 0; i < NumberOfColumns / 2 - 1; i++)
                    Move(0, 0, 0, 0);
                turnRight();
                for (int i = 0; i < u; i++)
                    Move(1, 0, 0, 0);
                PUT();
                turnLeft();
                Move(0, 0, 0, 0);
                turnRight();
                if ((NumberOfRows - 1) % 4 == 0)
                    Move(0, 0, 0, 0);
                for (int i = 0; i < u - 1; i++)
                    Move(1, 0, 0, 0);
                PUT();
                turnRight();
                while (!frontIsBlocked()) Move(0, 0, 0, 0);
            } else {
                for (int i = 0; i < NumberOfColumns / 2; i++)
                    Move(0, 0, 0, 0);
                PUT(); turnLeft();
                for (int i = 0; i < NumberOfRows / 2; i++)
                    Move(1, 0, 0, 0);
                PUT(); turnRight();
                while (!frontIsBlocked())
                    Move(0, 0, 0, 0);
                Move(0, 0, 1, 0);
                turnRight();
                int u = ((NumberOfColumns - 1) / 2 + 1) / 2;
                for (int i = 0; i < u - 1; i++)
                    Move(1, 0, 0, 0);
                PUT(); turnRight();
                Move(0, 0, 0, 0);
                turnLeft();
                if ((NumberOfColumns - 1) % 4 == 0)
                    Move(0, 0, 0, 0);
                for (int i = 0; i < u; i++)
                    Move(1, 0, 0, 0);
                Move(0, 1, 0, 0);
                Move(0, 0, 1, 0);
                for (int i = 0; i < u - 1; i++)
                    Move(1, 0, 0, 0);
                PUT(); turnRight();
                Move(0, 0, 0, 0);
                turnLeft();
                if ((NumberOfColumns - 1) % 4 == 0)
                    Move(0, 0, 0, 0);
                for (int i = 0; i < u - 1; i++)
                    Move(1, 0, 0, 0);
                PUT(); turnAround();
                for (int i = 0; i < NumberOfColumns / 2; i++)
                    Move(0, 0, 0, 0);
                turnLeft();
                while (!frontIsBlocked())
                    Move(1, 0, 0, 0);
                turnRight(); PUT();
                while (!frontIsBlocked())
                    Move(0, 0, 0, 0);
            }
        }
        System.out.println(moves);
    }

    private void diagonal() {
        int moves = 0;
        while (!frontIsBlocked())
            Move(0, 0, 0, 0);
        PUT(); turnAround();
        while (!frontIsBlocked()) {
            Move(0, 0, 0, 0);
            Move(0, 0, 1, 0);
            PUT(); turnLeft();
        }
        turnLeft();
        while (!frontIsBlocked()) Move(0, 0, 0, 0);
        turnLeft(); PUT();
        while (!frontIsBlocked()) {
            Move(0, 0, 0, 0);
            Move(0, 1, 0, 0);
            PUT(); turnRight();
        }
    }

    private int Transformation(boolean left, boolean right, boolean Put) {
        int counter = 0;
        while (!frontIsBlocked()) {
            Move(0, 0, 0, 0);
            counter++;
            if (Put && noBeepersPresent()) putBeeper();
        }
        if (left) turnLeft();
        if (right) turnRight();
        return counter;
    }

    private void PUT() {
        if (noBeepersPresent()) putBeeper();
    }

    private void Move(int put, int left, int right, int around) {
        if (put == 1) PUT();
        if (left == 1) turnLeft();
        else if (right == 1) turnRight();
        else if (around == 1) turnAround();
        move(); moves++;
    }

    private void LeftRightMove(int x, int t) {
        int turn = 0, moves = 0;
        for (int i = 0; i < x - t; i++) {
            if (turn == 0) {
                Move(1, 1, 0, 0);
                turnLeft();
                Move(1, 0, 0, 0);
            } else {
                Move(1, 0, 1, 0);
                turnRight();
                Move(1, 0, 0, 0);
            }
            turn ^= 1;
        }
    }

    private void ZigZag(int rows, int columns) {
        int moves = 0;
        Move(1, 0, 0, 0);
        Move(0, 1, 0, 0);
        PUT();
        if (columns != 0) turnRight();
        if (rows == 2 || columns == 2) return ;
        if (columns != 0) {
            Move(0, 0, 0, 0);
            Move(0, 0, 1, 0);
            PUT();
        } else {
            Move(0, 1, 0,0 );
            Move(0, 0, 1, 0);
            Move(1, 0, 1, 0);
        }
        if (rows == 3 || columns == 3) return ;
        Move(0, 1, 0, 0);
        if (columns != 0) {
            Move(0, 1, 0, 0);
        }
        PUT();
    }

    private void WalkAndPut(int steps, int rows, int enable) {
        int moves = 0, counter = 0;
        boolean flag = true;
        int x = rows % 4;
        if (rows % 4 != 0 && rows % 2 == 0) {
            flag = false;
            rows -= 2;
        }
        if (rows % 2 == 1) flag = false;
        for (int i = 0; i < rows - 1 - (rows % 4 == 3 ? steps : 0); i++) {
            if (i == 0 || steps == counter) {
                PUT();
                if (i == 0 && flag) turnAround();
                else turnLeft();
                Move(0, 0, 0, 0);
                Move(1, 0, 0, 1);
                turnLeft();
                counter = 0;
            } else counter++;
            Move(0, 0, 0, 0);
        }
        if (rows % 4 == 1) PUT();
        if (enable == 0) {
            turnLeft();
            if (!frontIsBlocked()) {
                Move(0, 0, 0, 0);
            }
        }
        if (rows % 4 == 1) PUT();
        if (enable == 1 && rows % 4 == 1) {
            Move(0, 1, 0, 0);
            Move(1, 0, 0, 1);
        }
    }
}