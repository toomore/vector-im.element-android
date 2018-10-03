/*
 * Copyright 2016 OpenMarket Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package im.vector.matrix.core.internal.sync.data

import com.squareup.moshi.JsonClass

// RoomSync represents the response for a room during server sync v2.
@JsonClass(generateAdapter = true)
data class RoomSync(
        /**
         * The state updates for the room.
         */
        var state: RoomSyncState? = null,

        /**
         * The timeline of messages and state changes in the room.
         */
        var timeline: RoomSyncTimeline? = null,

        /**
         * The ephemeral events in the room that aren't recorded in the timeline or state of the room (e.g. typing, receipts).
         */
        var ephemeral: RoomSyncEphemeral? = null,

        /**
         * The account data events for the room (e.g. tags).
         */
        var accountData: RoomSyncAccountData? = null,

        /**
         * The notification counts for the room.
         */
        var unreadNotifications: RoomSyncUnreadNotifications? = null

)