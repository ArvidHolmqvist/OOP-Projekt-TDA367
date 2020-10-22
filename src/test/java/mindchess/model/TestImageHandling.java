package mindchess.model;

import mindchess.controller.ImageHandlerUtil;
import mindchess.model.enums.PlayerType;
import org.junit.Before;

public class TestImageHandling {
    ChessFacade model;
    ImageHandlerUtil imageHandlerUtil;
    @Before
    public void init() {
        model = new ChessFacade();
        model.createNewGame("White", "Black", PlayerType.HUMAN, PlayerType.HUMAN, 180);
        imageHandlerUtil = new ImageHandlerUtil();
    }

    //Input stream error. File paths in imagehandler don't work with travis
    /*
    @Test
    public void testPieceImageFetch(){
        ImageView test1 = new ImageView();
        test1.setImage(new Image(getClass().getResourceAsStream("/chesspieces/black_rook.png")));
        assertTrue(imageHandler.getPieceImages().get(0).getCssMetaData().equals(test1.getCssMetaData()));

        ImageView test2 = new ImageView();
        test2.setImage(new Image(getClass().getResourceAsStream("/chesspieces/black_bishop.png")));
        assertTrue(imageHandler.getPieceImages().get(2).getCssMetaData().equals(test2.getCssMetaData()));
    }*/

    /*
    @Test
    public void testUpdateCoordinates() {
        ImageView test = imageHandler.getPieceImages().get(0);
        assertTrue(test.getX() == 5);
        assertTrue(test.getY() == 5);

        //hardcoded test for moving piece, also outdated (square)
//        model.getBoard().getPieces().get(0).setSquare(model.getBoard().getSquares()[2][2]);

        imageHandler.updateImageCoordinates();

        assertTrue(test.getX() == 2 * imageHandler.getSquareDimension() + 5);
        assertTrue(test.getY() == 2 * imageHandler.getSquareDimension() + 5);
    }*/
}