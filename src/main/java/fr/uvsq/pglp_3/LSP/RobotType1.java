package fr.uvsq.pglp_3.LSP;


public class RobotType1 extends Robot {

	public void avance() {
		switch (direction) {
		case Nord :
			position.y++;
		break;
		case Sud :
			position.y--;
		break;
		case Ouest :
			position.x--;
		break;
		case Est :
			position.x++;
		break;
		default :
		break;
		}
	}
}
