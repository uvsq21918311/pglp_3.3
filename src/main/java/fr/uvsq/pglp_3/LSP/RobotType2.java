package fr.uvsq.pglp_3.LSP;


public class RobotType2 extends Robot {

	private final int vitesse;

	public RobotType2(final int vitesse) {
		super();
		this.vitesse = vitesse;
	}
	@Override

	public void avance() {
		switch (direction) {
		case Nord :
			position.y += vitesse;
		break;
		case Sud :
			position.y -= vitesse;
		break;
		case Ouest :
			position.x -= vitesse;
		break;
		case Est :
			position.x += vitesse;
		break;
		default :
		break;
		}
	}
}
