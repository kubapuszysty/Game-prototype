/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciężka.grypsera.states;

import ciężka.grypsera.Game;
import ciężka.grypsera.Handler;
import ciężka.grypsera.entities.creatures.Player;
import ciężka.grypsera.entities.statics.Tree;
import ciężka.grypsera.gfx.Assets;
import ciężka.grypsera.tiles.Tile;
import ciężka.grypsera.worlds.World;
import java.awt.Graphics;

/**
 *
 * @author KUBA
 */
public class GameState extends State {
    
    private Player player;
    private World world;
    
    public GameState(Handler handler)
    {
        super(handler);
        world = new World(handler, "res/worlds/world1.txt");
        handler.setWorld(world);
        
        
    }

    @Override
    public void tick() {
        world.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }
    
}
