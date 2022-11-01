package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.EndCameraSceneLookNotifyOuterClass.EndCameraSceneLookNotify;

public class PacketEndCameraSceneLookNotify extends BasePacket {

	public PacketEndCameraSceneLookNotify() {
		super(PacketOpcodes.EndCameraSceneLookNotify);

		this.setData(EndCameraSceneLookNotify.newBuilder());
	}
}
