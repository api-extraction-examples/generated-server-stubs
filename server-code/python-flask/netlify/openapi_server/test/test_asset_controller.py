import unittest

from flask import json

from openapi_server.models.asset import Asset  # noqa: E501
from openapi_server.models.asset_signature import AssetSignature  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAssetController(BaseTestCase):
    """AssetController integration test stubs"""

    def test_create_site_asset(self):
        """Test case for create_site_asset

        
        """
        query_string = [('name', 'name_example'),
                        ('size', 56),
                        ('content_type', 'content_type_example'),
                        ('visibility', 'visibility_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/assets'.format(site_id='site_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_site_asset(self):
        """Test case for delete_site_asset

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/assets/{asset_id}'.format(site_id='site_id_example', asset_id='asset_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_site_asset_info(self):
        """Test case for get_site_asset_info

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/assets/{asset_id}'.format(site_id='site_id_example', asset_id='asset_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_assets(self):
        """Test case for list_site_assets

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/assets'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_site_asset(self):
        """Test case for update_site_asset

        
        """
        query_string = [('state', 'state_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/assets/{asset_id}'.format(site_id='site_id_example', asset_id='asset_id_example'),
            method='PUT',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
