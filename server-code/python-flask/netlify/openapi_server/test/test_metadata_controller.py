import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMetadataController(BaseTestCase):
    """MetadataController integration test stubs"""

    def test_get_site_metadata(self):
        """Test case for get_site_metadata

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/metadata'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_site_metadata(self):
        """Test case for update_site_metadata

        
        """
        metadata = None
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/metadata'.format(site_id='site_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(metadata),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
