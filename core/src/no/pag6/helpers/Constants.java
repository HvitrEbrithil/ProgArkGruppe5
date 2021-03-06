package no.pag6.helpers;

import com.badlogic.gdx.math.Vector2;

public interface Constants {

    AssetLoader al = AssetLoader.getInstance();

    // Screen and viewport
    int V_WIDTH = 1600, V_HEIGHT = 900;
    float PPM = 100;
    int A_WIDTH = (int) (V_WIDTH/PPM), A_HEIGHT = (int) (V_HEIGHT/PPM);
    float TIME_STEP = 1/60f;

    // UI
    float FONT_SCALE = 3.4f;
    float UI_SCALE = 0.9f;

    // Play state
    Vector2 GRAVITY = new Vector2(0, -10);

    String FIRST_LAYER_NAME = "lane1_collision",
            SECOND_LAYER_NAME = "lane2_collision",
            FIRST_FIRST_GFX_LAYER_NAME = "lane1_ground1",
            FIRST_SECOND_GFX_LAYER_NAME = "lane1_ground2",
            SECOND_FIRST_GFX_LAYER_NAME = "lane2_ground1",
            SECOND_SECOND_GFX_LAYER_NAME = "lane2_ground2",
            GOAL_COLLISION_NAME = "goal_collision",
            MAP_EASY_1_NAME = "e1_map.tmx",
            MAP_MED_1_NAME = "m1_map.tmx",
            MAP_HARD_1_NAME = "h1_map.tmx";

    String[] LAYERS = {FIRST_LAYER_NAME, SECOND_LAYER_NAME, GOAL_COLLISION_NAME};

    short FIRST_LAYER_BITS = 2, SECOND_LAYER_BITS = 4, GOAL_LAYER_BITS = 8;
    short[] FILTER_BITS = {FIRST_LAYER_BITS, SECOND_LAYER_BITS, GOAL_LAYER_BITS};

    int INIT_PLAYER_POS_X = 1155, INIT_PLAYER_POS_Y = 1700, PLAYER_BODY_RADIUS = 10;

    float PLAYER_MAX_VELOCITY = 2;

    // Game
    int MAX_PLAYERS = 8;
    int HIGHSCORES_TO_SHOW = 10;

}
