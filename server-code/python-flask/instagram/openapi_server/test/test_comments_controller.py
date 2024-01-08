import unittest

from flask import json

from openapi_server.models.comments_response import CommentsResponse  # noqa: E501
from openapi_server.models.status_response import StatusResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestCommentsController(BaseTestCase):
    """CommentsController integration test stubs"""

    def test_media_media_id_comments_comment_id_delete(self):
        """Test case for media_media_id_comments_comment_id_delete

        Remove a comment.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/{media_id}/comments/{comment_id}'.format(media_id='media_id_example', comment_id='comment_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_media_id_comments_get(self):
        """Test case for media_media_id_comments_get

        Get a list of recent comments on a media object.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/{media_id}/comments'.format(media_id='media_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_media_id_comments_post(self):
        """Test case for media_media_id_comments_post

        Create a comment on a media object.
        """
        query_string = [('text', 'text_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/{media_id}/comments'.format(media_id='media_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
