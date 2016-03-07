package com.scienjus.mytrip.event

import com.scienjus.mytrip.TableInfo

/**
 * @author ScienJus
 * @date 16/3/5.
 */
data class InsertEvent(val tableInfo: TableInfo, val data: Map<String, Any?>) : LogEvent