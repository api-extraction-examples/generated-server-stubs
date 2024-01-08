import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.typeahead_for_workspace200_response import TypeaheadForWorkspace200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTypeaheadController(BaseTestCase):
    """TypeaheadController integration test stubs"""

    def test_typeahead_for_workspace(self):
        """Test case for typeahead_for_workspace

        Get objects via typeahead
        """
        query_string = [('resource_type', 'user'),
                        ('type', 'user'),
                        ('query', 'Greg'),
                        ('count', 20),
                        ('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/workspaces/{workspace_gid}/typeahead'.format(workspace_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
