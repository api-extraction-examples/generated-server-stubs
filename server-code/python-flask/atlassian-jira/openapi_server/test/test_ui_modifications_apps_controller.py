import unittest

from flask import json

from openapi_server.models.create_ui_modification_details import CreateUiModificationDetails  # noqa: E501
from openapi_server.models.page_bean_ui_modification_details import PageBeanUiModificationDetails  # noqa: E501
from openapi_server.models.ui_modification_identifiers import UiModificationIdentifiers  # noqa: E501
from openapi_server.models.update_ui_modification_details import UpdateUiModificationDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUIModificationsAppsController(BaseTestCase):
    """UIModificationsAppsController integration test stubs"""

    def test_create_ui_modification(self):
        """Test case for create_ui_modification

        Create UI modification
        """
        create_ui_modification_details = {"data":"data","name":"name","description":"description","contexts":[{"isAvailable":True,"issueTypeId":"issueTypeId","viewType":"viewType","id":"id","projectId":"projectId"},{"isAvailable":True,"issueTypeId":"issueTypeId","viewType":"viewType","id":"id","projectId":"projectId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/uiModifications',
            method='POST',
            headers=headers,
            data=json.dumps(create_ui_modification_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_ui_modification(self):
        """Test case for delete_ui_modification

        Delete UI modification
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/uiModifications/{ui_modification_id}'.format(ui_modification_id='ui_modification_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_ui_modifications(self):
        """Test case for get_ui_modifications

        Get UI modifications
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('expand', 'expand_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/uiModifications',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_ui_modification(self):
        """Test case for update_ui_modification

        Update UI modification
        """
        update_ui_modification_details = {"data":"data","name":"name","description":"description","contexts":[{"isAvailable":True,"issueTypeId":"issueTypeId","viewType":"viewType","id":"id","projectId":"projectId"},{"isAvailable":True,"issueTypeId":"issueTypeId","viewType":"viewType","id":"id","projectId":"projectId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/uiModifications/{ui_modification_id}'.format(ui_modification_id='ui_modification_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_ui_modification_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
