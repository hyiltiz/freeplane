/**
 * author: Marcel Genzmehr
 * 10.08.2011
 */
package org.freeplane.plugin.workspace.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTree;

import org.freeplane.plugin.workspace.model.node.AWorkspaceTreeNode;

/**
 * 
 */
public class DefaultWorkspaceKeyHandler implements KeyListener {

	
	/***********************************************************************************
	 * CONSTRUCTORS
	 **********************************************************************************/

	/***********************************************************************************
	 * METHODS
	 **********************************************************************************/

	/***********************************************************************************
	 * REQUIRED METHODS FOR INTERFACES
	 **********************************************************************************/
	
	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			AWorkspaceTreeNode node = (AWorkspaceTreeNode)((JTree)e.getSource()).getSelectionPath().getLastPathComponent();
			if (node instanceof IWorkspaceNodeEventListener) {
				((IWorkspaceNodeEventListener) node).handleEvent(new WorkspaceNodeEvent(node, WorkspaceNodeEvent.WSNODE_OPEN_DOCUMENT, 0, 0, e.getComponent()));
				e.consume();
			}
		}
	}

	public void keyReleased(KeyEvent e) {
	}
}
