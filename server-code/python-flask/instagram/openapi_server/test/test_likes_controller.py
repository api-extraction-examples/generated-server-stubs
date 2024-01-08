import unittest

from flask import json

from openapi_server.models.status_response import StatusResponse  # noqa: E501
from openapi_server.models.users_info_response import UsersInfoResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLikesController(BaseTestCase):
    """LikesController integration test stubs"""

    def test_media_media_id_likes_delete(self):
        """Test case for media_media_id_likes_delete

        Remove a like on this media by the current user.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/{media_id}/likes'.format(media_id='media_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_media_id_likes_get(self):
        """Test case for media_media_id_likes_get

        Get a list of users who have liked this media.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/{media_id}/likes'.format(media_id='media_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_media_media_id_likes_post(self):
        """Test case for media_media_id_likes_post

        Set a like on this media by the current user.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/media/{media_id}/likes'.format(media_id='media_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
