/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.bjornchaudron;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "Help",
        id = "nl.hu.bjornchaudron.OracleActionListener"
)
@ActionRegistration(
        iconBase = "nl/hu/bjornchaudron/Oracle.png",
        displayName = "#CTL_OracleActionListener"
)
@ActionReferences({
  @ActionReference(path = "Toolbars/Build", position = 450)
})
@Messages("CTL_OracleActionListener=Search Oracle Documentation")
public final class OracleActionListener extends AbstractAction implements Presenter.Toolbar {

    @Override
    public Component getToolbarPresenter() {
        return new OracleDocPanel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
