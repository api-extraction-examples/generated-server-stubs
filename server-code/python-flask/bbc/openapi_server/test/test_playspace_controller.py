import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.playspace_container import PlayspaceContainer  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPlayspaceController(BaseTestCase):
    """PlayspaceController integration test stubs"""

    def test_get_container(self):
        """Test case for get_container

        Playspace Container by ID
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/playspace/containers/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_suggest_container(self):
        """Test case for suggest_container

        Suggested Playspace Container
        """
        query_string = [('previous_pid', 'previous_pid_example'),
                        ('previous_container', 'previous_container_example')]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/playspace/containers/suggested',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
