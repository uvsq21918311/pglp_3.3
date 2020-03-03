package fr.uvsq.pglp_3.LSP;


public abstract class Robot {
	
	protected Position position;
	
	protected Direction direction;

	public Robot() {
		position = new Position();
		direction = Direction.Nord;
	}

	public Robot(final Position p) {
		position = p;
	}

	public abstract void avance();

	public void tourne() {
		switch (direction) {
		case Nord :
			direction = Direction.Est;
		break;
		case Sud :
			direction = Direction.Ouest;
		break;
		case Ouest :
			direction = Direction.Nord;
		break;
		case Est :
			direction = Direction.Sud;
		break;
		default :
		break;
		}
	}

	public Position getPosition() {
		return new Position(position.x, position.y);
	}
}
