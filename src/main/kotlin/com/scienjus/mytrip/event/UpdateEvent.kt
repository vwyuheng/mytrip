package com.scienjus.mytrip.event

import com.scienjus.mytrip.TableInfo

/**
 * @author ScienJus
 * @date 16/3/5.
 */
data class UpdateEvent(val tableInfo: TableInfo, val before: Map<String, Any?>, val data: Map<String, Any?>) : LogEvent