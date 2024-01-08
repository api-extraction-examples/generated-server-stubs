import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.full_item import FullItem  # noqa: E501
from openapi_server.models.item import Item  # noqa: E501
from openapi_server.models.patch_inner import PatchInner  # noqa: E501
from openapi_server.test import BaseTestCase


class TestItemsController(BaseTestCase):
    """ItemsController integration test stubs"""

    def test_create_vault_item(self):
        """Test case for create_vault_item

        Create a new Item
        """
        full_item = null
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items'.format(vault_uuid='vault_uuid_example'),
            method='POST',
            headers=headers,
            data=json.dumps(full_item),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_vault_item(self):
        """Test case for delete_vault_item

        Delete an Item
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items/{item_uuid}'.format(vault_uuid='vault_uuid_example', item_uuid='item_uuid_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vault_item_by_id(self):
        """Test case for get_vault_item_by_id

        Get the details of an Item
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items/{item_uuid}'.format(vault_uuid='vault_uuid_example', item_uuid='item_uuid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_vault_items(self):
        """Test case for get_vault_items

        Get all items for inside a Vault
        """
        query_string = [('filter', 'title eq \"Some Item Name\"')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items'.format(vault_uuid='vault_uuid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_vault_item(self):
        """Test case for patch_vault_item

        Update a subset of Item attributes
        """
        patch_inner = [{"op":"replace","path":"/favorite","value":true},{"op":"remove","path":"/tags/1"}]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items/{item_uuid}'.format(vault_uuid='vault_uuid_example', item_uuid='item_uuid_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_inner),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_vault_item(self):
        """Test case for update_vault_item

        Update an Item
        """
        full_item = null
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/vaults/{vault_uuid}/items/{item_uuid}'.format(vault_uuid='vault_uuid_example', item_uuid='item_uuid_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(full_item),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
