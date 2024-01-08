import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.vault import Vault  # noqa: E501
from openapi_server.test import BaseTestCase


class TestVaultsController(BaseTestCase):
    """VaultsController integration test stubs"""

    def test_get_vault_by_id(self):
        """Test case for get_vault_by_id

        Get Vault details and metadata
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}'.format(vault_uuid='vault_uuid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vaults(self):
        """Test case for get_vaults

        Get all Vaults
        """
        query_string = [('filter', 'name eq \"Some Vault Name\"')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
