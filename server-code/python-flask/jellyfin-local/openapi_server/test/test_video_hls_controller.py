import unittest

from flask import json

from openapi_server.models.encoding_context import EncodingContext  # noqa: E501
from openapi_server.models.subtitle_delivery_method import SubtitleDeliveryMethod  # noqa: E501
from openapi_server.test import BaseTestCase


class TestVideoHlsController(BaseTestCase):
    """VideoHlsController integration test stubs"""

    def test_get_live_hls_stream(self):
        """Test case for get_live_hls_stream

        Gets a hls live stream.
        """
        query_string = [('container', 'container_example'),
                        ('static', True),
                        ('params', 'params_example'),
                        ('tag', 'tag_example'),
                        ('deviceProfileId', 'device_profile_id_example'),
                        ('playSessionId', 'play_session_id_example'),
                        ('segmentContainer', 'segment_container_example'),
                        ('segmentLength', 56),
                        ('minSegments', 56),
                        ('mediaSourceId', 'media_source_id_example'),
                        ('deviceId', 'device_id_example'),
                        ('audioCodec', 'audio_codec_example'),
                        ('enableAutoStreamCopy', True),
                        ('allowVideoStreamCopy', True),
                        ('allowAudioStreamCopy', True),
                        ('breakOnNonKeyFrames', True),
                        ('audioSampleRate', 56),
                        ('maxAudioBitDepth', 56),
                        ('audioBitRate', 56),
                        ('audioChannels', 56),
                        ('maxAudioChannels', 56),
                        ('profile', 'profile_example'),
                        ('level', 'level_example'),
                        ('framerate', 3.4),
                        ('maxFramerate', 3.4),
                        ('copyTimestamps', True),
                        ('startTimeTicks', 56),
                        ('width', 56),
                        ('height', 56),
                        ('videoBitRate', 56),
                        ('subtitleStreamIndex', 56),
                        ('subtitleMethod', openapi_server.SubtitleDeliveryMethod()),
                        ('maxRefFrames', 56),
                        ('maxVideoBitDepth', 56),
                        ('requireAvc', True),
                        ('deInterlace', True),
                        ('requireNonAnamorphic', True),
                        ('transcodingMaxAudioChannels', 56),
                        ('cpuCoreLimit', 56),
                        ('liveStreamId', 'live_stream_id_example'),
                        ('enableMpegtsM2TsMode', True),
                        ('videoCodec', 'video_codec_example'),
                        ('subtitleCodec', 'subtitle_codec_example'),
                        ('transcodeReasons', 'transcode_reasons_example'),
                        ('audioStreamIndex', 56),
                        ('videoStreamIndex', 56),
                        ('context', openapi_server.EncodingContext()),
                        ('streamOptions', {'key': 'stream_options_example'}),
                        ('maxWidth', 56),
                        ('maxHeight', 56),
                        ('enableSubtitlesInManifest', True)]
        headers = { 
            'Accept': 'application/x-mpegURL',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Videos/{item_id}/live.m3u8'.format(item_id='item_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()