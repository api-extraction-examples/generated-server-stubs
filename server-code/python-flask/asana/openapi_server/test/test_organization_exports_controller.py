import unittest

from flask import json

from openapi_server.models.create_organization_export201_response import CreateOrganizationExport201Response  # noqa: E501
from openapi_server.models.create_organization_export_request import CreateOrganizationExportRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestOrganizationExportsController(BaseTestCase):
    """OrganizationExportsController integration test stubs"""

    def test_create_organization_export(self):
        """Test case for create_organization_export

        Create an organization export request
        """
        create_organization_export_request = openapi_server.CreateOrganizationExportRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/organization_exports',
            method='POST',
            headers=headers,
            data=json.dumps(create_organization_export_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_organization_export(self):
        """Test case for get_organization_export

        Get details on an org export request
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/organization_exports/{organization_export_gid}'.format(organization_export_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
