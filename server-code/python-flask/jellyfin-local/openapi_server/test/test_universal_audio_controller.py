import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestUniversalAudioController(BaseTestCase):
    """UniversalAudioController integration test stubs"""

    def test_get_universal_audio_stream(self):
        """Test case for get_universal_audio_stream

        Gets an audio stream.
        """
        query_string = [('container', ['container_example']),
                        ('mediaSourceId', 'media_source_id_example'),
                        ('deviceId', 'device_id_example'),
                        ('userId', 'user_id_example'),
                        ('audioCodec', 'audio_codec_example'),
                        ('maxAudioChannels', 56),
                        ('transcodingAudioChannels', 56),
                        ('maxStreamingBitrate', 56),
                        ('audioBitRate', 56),
                        ('startTimeTicks', 56),
                        ('transcodingContainer', 'transcoding_container_example'),
                        ('transcodingProtocol', 'transcoding_protocol_example'),
                        ('maxAudioSampleRate', 56),
                        ('maxAudioBitDepth', 56),
                        ('enableRemoteMedia', True),
                        ('breakOnNonKeyFrames', True),
                        ('enableRedirection', True)]
        headers = { 
            'Accept': 'audio/*',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Audio/{item_id}/universal'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_head_universal_audio_stream(self):
        """Test case for head_universal_audio_stream

        Gets an audio stream.
        """
        query_string = [('container', ['container_example']),
                        ('mediaSourceId', 'media_source_id_example'),
                        ('deviceId', 'device_id_example'),
                        ('userId', 'user_id_example'),
                        ('audioCodec', 'audio_codec_example'),
                        ('maxAudioChannels', 56),
                        ('transcodingAudioChannels', 56),
                        ('maxStreamingBitrate', 56),
                        ('audioBitRate', 56),
                        ('startTimeTicks', 56),
                        ('transcodingContainer', 'transcoding_container_example'),
                        ('transcodingProtocol', 'transcoding_protocol_example'),
                        ('maxAudioSampleRate', 56),
                        ('maxAudioBitDepth', 56),
                        ('enableRemoteMedia', True),
                        ('breakOnNonKeyFrames', True),
                        ('enableRedirection', True)]
        headers = { 
            'Accept': 'audio/*',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Audio/{item_id}/universal'.format(item_id='item_id_example'),
            method='HEAD',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
