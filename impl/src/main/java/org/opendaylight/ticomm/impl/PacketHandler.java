/*
 * Copyright © 2017 Ticomm and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.ticomm.impl;

import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketProcessingListener;
import org.opendaylight.yang.gen.v1.urn.opendaylight.packet.service.rev130709.PacketReceived;

/**
 * 公司名：none   项目版本：Packet Handler v1.0
 * @作者：qiwei.hu
 * @时间：2017年8月14日 上午10:34:10
 * @描述：
 * 相关类库：
 * 原理：
 * 
 */
public class PacketHandler implements PacketProcessingListener {

	int i = 0;
	/**
	 *@描述：@param notification
	 *@时间：2017年8月14日 上午10:34:10
	 *@作者：qiwei.hu
	 */
	@Override
	public void onPacketReceived(PacketReceived notification) {
		// TODO Auto-generated method stub

		this.i++;
		System.out.println("Received "+this.i+" packet");
//		TO-DO
	}

}
