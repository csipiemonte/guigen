package it.csi.mddtools.guigen.workflow.component;

import it.csi.mddtools.guigen.genutils.MiscUtils;

import java.io.IOException;
import java.util.Properties;
import java.util.jar.Manifest;

import mddtools.usagetracking.ProfilingPacketBuilder;
import mddtools.usagetracking.TrackingSender;

import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

public class TrackingInvoker extends org.openarchitectureware.workflow.lib.AbstractWorkflowComponent{

	public void checkConfiguration(Issues issues) {
		// TODO Auto-generated method stub
		
	}

	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		// TODO Auto-generated method stub
		System.out.println("invoke TrackingInvoker");
	}

	public void setTrack(boolean b) {
		if (TrackingSender.isTrackingActive()) {
			// System.out.println("setTrack:"+modelName);
			String pluginName = MiscUtils.getPluginName();
			String pluginVersion = MiscUtils.getPluginVersion();
			Properties info = ProfilingPacketBuilder.packGenerateInfo(
					pluginName, pluginVersion, modelName, "?",
					targetProjectName);
			System.out.println("333");
			TrackingSender.sendTrackingInfo(info);
		}
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setTargetProjectName(String targetProjectName) {
		this.targetProjectName = targetProjectName;
	}

	public String getTargetProjectName() {
		return targetProjectName;
	}

	private String modelName;
	private String targetProjectName;
}
