/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cnc.gcode.controller;

/**
 *
 * @author n.rambaud
 */
public interface ISettingsPanel {
   boolean configureDataToDisplay(String[] infoTxt, double[] values);
}
