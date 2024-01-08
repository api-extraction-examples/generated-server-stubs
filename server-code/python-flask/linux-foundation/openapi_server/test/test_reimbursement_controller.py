import unittest

from flask import json

from openapi_server.models.create_reimbursement_request import CreateReimbursementRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.policy_update_input import PolicyUpdateInput  # noqa: E501
from openapi_server.test import BaseTestCase


class TestReimbursementController(BaseTestCase):
    """ReimbursementController integration test stubs"""

    def test_create_reimbursement(self):
        """Test case for create_reimbursement

        Create Reimbursement
        """
        body = openapi_server.CreateReimbursementRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/v1/reimbursement/{project_id}'.format(project_id='project_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_reimbursement(self):
        """Test case for update_reimbursement

        Update Reimbursement
        """
        body = openapi_server.PolicyUpdateInput()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'ApiKeyAuth': 'special-key',
        }
        response = self.client.open(
            '/v1/reimbursement/{project_id}'.format(project_id='project_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
