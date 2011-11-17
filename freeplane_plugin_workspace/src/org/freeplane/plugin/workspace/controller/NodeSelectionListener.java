package org.freeplane.plugin.workspace.controller;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.freeplane.plugin.workspace.model.node.AWorkspaceTreeNode;

public class NodeSelectionListener implements TreeSelectionListener {
	
	public void valueChanged(TreeSelectionEvent event) {
	    AWorkspaceTreeNode node = (AWorkspaceTreeNode)(event.getPath().getLastPathComponent());
	    if(node instanceof TreeSelectionListener) {
        	((TreeSelectionListener)node).valueChanged(event);
        }
	}
}
