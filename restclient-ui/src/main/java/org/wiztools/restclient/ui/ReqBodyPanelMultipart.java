package org.wiztools.restclient.ui;

import javax.swing.JPanel;
import org.wiztools.restclient.ReqEntity;

/**
 *
 * @author subwiz
 */
public class ReqBodyPanelMultipart extends JPanel implements ReqBodyOps {
    @Override
    public void enableBody() {
        // enable control
    }
    
    @Override
    public void disableBody() {
        // disable control
    }
    
    @Override
    public void clear() {
        // enable control
    }
    
    @Override
    public ReqEntity getEntity() {
        return null;
    }
}
