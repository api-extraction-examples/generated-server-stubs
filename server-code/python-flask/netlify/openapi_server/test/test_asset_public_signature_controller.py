import unittest

from flask import json

from openapi_server.models.asset_public_signature import AssetPublicSignature  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAssetPublicSignatureController(BaseTestCase):
    """AssetPublicSignatureController integration test stubs"""

    def test_get_site_asset_public_signature(self):
        """Test case for get_site_asset_public_signature

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/assets/{asset_id}/public_signature'.format(site_id='site_id_example', asset_id='asset_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
