import unittest

from flask import json

from openapi_server.models.app_encryption_declaration_builds_linkages_request import AppEncryptionDeclarationBuildsLinkagesRequest  # noqa: E501
from openapi_server.models.app_encryption_declaration_response import AppEncryptionDeclarationResponse  # noqa: E501
from openapi_server.models.app_encryption_declarations_response import AppEncryptionDeclarationsResponse  # noqa: E501
from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppEncryptionDeclarationsController(BaseTestCase):
    """AppEncryptionDeclarationsController integration test stubs"""

    def test_app_encryption_declarations_app_get_to_one_related(self):
        """Test case for app_encryption_declarations_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appEncryptionDeclarations/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_encryption_declarations_builds_create_to_many_relationship(self):
        """Test case for app_encryption_declarations_builds_create_to_many_relationship

        
        """
        app_encryption_declaration_builds_linkages_request = {"data":[{"id":"id","type":"builds"},{"id":"id","type":"builds"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appEncryptionDeclarations/{id}/relationships/builds'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(app_encryption_declaration_builds_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_encryption_declarations_get_collection(self):
        """Test case for app_encryption_declarations_get_collection

        
        """
        query_string = [('filter[platform]', ['filter_platform_example']),
                        ('filter[app]', ['filter_app_example']),
                        ('filter[builds]', ['filter_builds_example']),
                        ('fields[appEncryptionDeclarations]', ['fields_app_encryption_declarations_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appEncryptionDeclarations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_app_encryption_declarations_get_instance(self):
        """Test case for app_encryption_declarations_get_instance

        
        """
        query_string = [('fields[appEncryptionDeclarations]', ['fields_app_encryption_declarations_example']),
                        ('include', ['include_example']),
                        ('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/appEncryptionDeclarations/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
