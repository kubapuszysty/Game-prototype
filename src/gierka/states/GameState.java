/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gierka.states;

import gierka.entities.creatures.Player;
import gierka.worlds.World;
import gierka.Handler;
import gierka.Game;
import gierka.Handler;
import gierka.entities.creatures.Player;
import gierka.entities.statics.Tree;
import gierka.gfx.Assets;
import gierka.tiles.Tile;
import gierka.worlds.World;
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
