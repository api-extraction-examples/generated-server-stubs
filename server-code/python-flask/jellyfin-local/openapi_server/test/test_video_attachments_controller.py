import unittest

from flask import json

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestVideoAttachmentsController(BaseTestCase):
    """VideoAttachmentsController integration test stubs"""

    def test_get_attachment(self):
        """Test case for get_attachment

        Get video attachment.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Videos/{video_id}/{media_source_id}/Attachments/{index}'.format(video_id='video_id_example', media_source_id='media_source_id_example', index=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
