import unittest

from flask import json

from openapi_server.models.buffer_request_dto import BufferRequestDto  # noqa: E501
from openapi_server.models.group_info_dto import GroupInfoDto  # noqa: E501
from openapi_server.models.ignore_wait_request_dto import IgnoreWaitRequestDto  # noqa: E501
from openapi_server.models.join_group_request_dto import JoinGroupRequestDto  # noqa: E501
from openapi_server.models.move_playlist_item_request_dto import MovePlaylistItemRequestDto  # noqa: E501
from openapi_server.models.new_group_request_dto import NewGroupRequestDto  # noqa: E501
from openapi_server.models.next_item_request_dto import NextItemRequestDto  # noqa: E501
from openapi_server.models.ping_request_dto import PingRequestDto  # noqa: E501
from openapi_server.models.play_request_dto import PlayRequestDto  # noqa: E501
from openapi_server.models.previous_item_request_dto import PreviousItemRequestDto  # noqa: E501
from openapi_server.models.queue_request_dto import QueueRequestDto  # noqa: E501
from openapi_server.models.ready_request_dto import ReadyRequestDto  # noqa: E501
from openapi_server.models.remove_from_playlist_request_dto import RemoveFromPlaylistRequestDto  # noqa: E501
from openapi_server.models.seek_request_dto import SeekRequestDto  # noqa: E501
from openapi_server.models.set_playlist_item_request_dto import SetPlaylistItemRequestDto  # noqa: E501
from openapi_server.models.set_repeat_mode_request_dto import SetRepeatModeRequestDto  # noqa: E501
from openapi_server.models.set_shuffle_mode_request_dto import SetShuffleModeRequestDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSyncPlayController(BaseTestCase):
    """SyncPlayController integration test stubs"""

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_buffering(self):
        """Test case for sync_play_buffering

        Notify SyncPlay group that member is buffering.
        """
        buffer_request_dto = {"When":"2000-01-23T04:56:07.000+00:00","PositionTicks":0,"PlaylistItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","IsPlaying":True}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Buffering',
            method='POST',
            headers=headers,
            data=json.dumps(buffer_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_create_group(self):
        """Test case for sync_play_create_group

        Create a new SyncPlay group.
        """
        new_group_request_dto = {"GroupName":"GroupName"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/New',
            method='POST',
            headers=headers,
            data=json.dumps(new_group_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sync_play_get_groups(self):
        """Test case for sync_play_get_groups

        Gets all SyncPlay groups.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/List',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_join_group(self):
        """Test case for sync_play_join_group

        Join an existing SyncPlay group.
        """
        join_group_request_dto = {"GroupId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Join',
            method='POST',
            headers=headers,
            data=json.dumps(join_group_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sync_play_leave_group(self):
        """Test case for sync_play_leave_group

        Leave the joined SyncPlay group.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Leave',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_move_playlist_item(self):
        """Test case for sync_play_move_playlist_item

        Request to move an item in the playlist in SyncPlay group.
        """
        move_playlist_item_request_dto = {"PlaylistItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","NewIndex":0}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/MovePlaylistItem',
            method='POST',
            headers=headers,
            data=json.dumps(move_playlist_item_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_next_item(self):
        """Test case for sync_play_next_item

        Request next item in SyncPlay group.
        """
        next_item_request_dto = {"PlaylistItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/NextItem',
            method='POST',
            headers=headers,
            data=json.dumps(next_item_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sync_play_pause(self):
        """Test case for sync_play_pause

        Request pause in SyncPlay group.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Pause',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_ping(self):
        """Test case for sync_play_ping

        Update session ping.
        """
        ping_request_dto = {"Ping":0}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Ping',
            method='POST',
            headers=headers,
            data=json.dumps(ping_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_previous_item(self):
        """Test case for sync_play_previous_item

        Request previous item in SyncPlay group.
        """
        previous_item_request_dto = {"PlaylistItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/PreviousItem',
            method='POST',
            headers=headers,
            data=json.dumps(previous_item_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_queue(self):
        """Test case for sync_play_queue

        Request to queue items to the playlist of a SyncPlay group.
        """
        queue_request_dto = {"ItemIds":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"]}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Queue',
            method='POST',
            headers=headers,
            data=json.dumps(queue_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_ready(self):
        """Test case for sync_play_ready

        Notify SyncPlay group that member is ready for playback.
        """
        ready_request_dto = {"When":"2000-01-23T04:56:07.000+00:00","PositionTicks":0,"PlaylistItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","IsPlaying":True}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Ready',
            method='POST',
            headers=headers,
            data=json.dumps(ready_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_remove_from_playlist(self):
        """Test case for sync_play_remove_from_playlist

        Request to remove items from the playlist in SyncPlay group.
        """
        remove_from_playlist_request_dto = {"PlaylistItemIds":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"]}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/RemoveFromPlaylist',
            method='POST',
            headers=headers,
            data=json.dumps(remove_from_playlist_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_seek(self):
        """Test case for sync_play_seek

        Request seek in SyncPlay group.
        """
        seek_request_dto = {"PositionTicks":0}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Seek',
            method='POST',
            headers=headers,
            data=json.dumps(seek_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_set_ignore_wait(self):
        """Test case for sync_play_set_ignore_wait

        Request SyncPlay group to ignore member during group-wait.
        """
        ignore_wait_request_dto = {"IgnoreWait":True}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/SetIgnoreWait',
            method='POST',
            headers=headers,
            data=json.dumps(ignore_wait_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_set_new_queue(self):
        """Test case for sync_play_set_new_queue

        Request to set new playlist in SyncPlay group.
        """
        play_request_dto = {"PlayingQueue":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"StartPositionTicks":6,"PlayingItemPosition":0}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/SetNewQueue',
            method='POST',
            headers=headers,
            data=json.dumps(play_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_set_playlist_item(self):
        """Test case for sync_play_set_playlist_item

        Request to change playlist item in SyncPlay group.
        """
        set_playlist_item_request_dto = {"PlaylistItemId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91"}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/SetPlaylistItem',
            method='POST',
            headers=headers,
            data=json.dumps(set_playlist_item_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_set_repeat_mode(self):
        """Test case for sync_play_set_repeat_mode

        Request to set repeat mode in SyncPlay group.
        """
        set_repeat_mode_request_dto = {}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/SetRepeatMode',
            method='POST',
            headers=headers,
            data=json.dumps(set_repeat_mode_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_sync_play_set_shuffle_mode(self):
        """Test case for sync_play_set_shuffle_mode

        Request to set shuffle mode in SyncPlay group.
        """
        set_shuffle_mode_request_dto = {}
        headers = { 
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/SetShuffleMode',
            method='POST',
            headers=headers,
            data=json.dumps(set_shuffle_mode_request_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sync_play_stop(self):
        """Test case for sync_play_stop

        Request stop in SyncPlay group.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Stop',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sync_play_unpause(self):
        """Test case for sync_play_unpause

        Request unpause in SyncPlay group.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/SyncPlay/Unpause',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
