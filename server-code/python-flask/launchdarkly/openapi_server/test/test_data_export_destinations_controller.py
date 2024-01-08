import unittest

from flask import json

from openapi_server.models.destination import Destination  # noqa: E501
from openapi_server.models.destinations import Destinations  # noqa: E501
from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_destination_request import PostDestinationRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDataExportDestinationsController(BaseTestCase):
    """DataExportDestinationsController integration test stubs"""

    def test_delete_destination(self):
        """Test case for delete_destination

        Get a single data export destination by ID
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/destinations/{project_key}/{environment_key}/{destination_id}'.format(project_key='project_key_example', environment_key='environment_key_example', destination_id='destination_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_destination(self):
        """Test case for get_destination

        Get a single data export destination by ID
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/destinations/{project_key}/{environment_key}/{destination_id}'.format(project_key='project_key_example', environment_key='environment_key_example', destination_id='destination_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_destinations(self):
        """Test case for get_destinations

        Returns a list of all data export destinations.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/destinations',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_destination(self):
        """Test case for patch_destination

        Perform a partial update to a data export destination.
        """
        patch_only = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/destinations/{project_key}/{environment_key}/{destination_id}'.format(project_key='project_key_example', environment_key='environment_key_example', destination_id='destination_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_only),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_destination(self):
        """Test case for post_destination

        Create a new data export destination
        """
        destination_body = openapi_server.PostDestinationRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/destinations/{project_key}/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(destination_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
