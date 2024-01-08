import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestHlsSegmentController(BaseTestCase):
    """HlsSegmentController integration test stubs"""

    def test_get_hls_audio_segment_legacy_aac(self):
        """Test case for get_hls_audio_segment_legacy_aac

        Gets the specified audio segment for an audio item.
        """
        headers = { 
            'Accept': 'audio/*',
        }
        response = self.client.open(
            '/Audio/{item_id}/hls/{segment_id}/stream.aac'.format(item_id='item_id_example', segment_id='segment_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_hls_audio_segment_legacy_mp3(self):
        """Test case for get_hls_audio_segment_legacy_mp3

        Gets the specified audio segment for an audio item.
        """
        headers = { 
            'Accept': 'audio/*',
        }
        response = self.client.open(
            '/Audio/{item_id}/hls/{segment_id}/stream.mp3'.format(item_id='item_id_example', segment_id='segment_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_hls_playlist_legacy(self):
        """Test case for get_hls_playlist_legacy

        Gets a hls video playlist.
        """
        headers = { 
            'Accept': 'application/x-mpegURL',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Videos/{item_id}/hls/{playlist_id}/stream.m3u8'.format(item_id='item_id_example', playlist_id='playlist_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_hls_video_segment_legacy(self):
        """Test case for get_hls_video_segment_legacy

        Gets a hls video segment.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Videos/{item_id}/hls/{playlist_id}/{segment_id_segment_container}'.format(item_id='item_id_example', playlist_id='playlist_id_example', segment_id='segment_id_example', segment_container='segment_container_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stop_encoding_process(self):
        """Test case for stop_encoding_process

        Stops an active encoding.
        """
        query_string = [('deviceId', 'device_id_example'),
                        ('playSessionId', 'play_session_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Videos/ActiveEncodings',
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
