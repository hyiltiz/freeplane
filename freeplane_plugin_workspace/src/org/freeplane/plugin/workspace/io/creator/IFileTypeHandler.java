package org.freeplane.plugin.workspace.io.creator;

import java.io.File;

import org.freeplane.plugin.workspace.model.node.AWorkspaceTreeNode;


public interface IFileTypeHandler {
	AWorkspaceTreeNode createFileNode(AWorkspaceTreeNode parent, String fileExtension, File file);
	public Object[] getSupportedFileTypes();
}
