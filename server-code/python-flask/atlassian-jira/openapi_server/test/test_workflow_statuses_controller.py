import unittest

from flask import json

from openapi_server.models.status_details import StatusDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowStatusesController(BaseTestCase):
    """WorkflowStatusesController integration test stubs"""

    def test_get_status(self):
        """Test case for get_status

        Get status
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/status/{id_or_name}'.format(id_or_name='id_or_name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_statuses(self):
        """Test case for get_statuses

        Get all statuses
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/status',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
