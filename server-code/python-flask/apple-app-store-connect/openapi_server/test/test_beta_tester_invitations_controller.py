import unittest

from flask import json

from openapi_server.models.beta_tester_invitation_create_request import BetaTesterInvitationCreateRequest  # noqa: E501
from openapi_server.models.beta_tester_invitation_response import BetaTesterInvitationResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaTesterInvitationsController(BaseTestCase):
    """BetaTesterInvitationsController integration test stubs"""

    def test_beta_tester_invitations_create_instance(self):
        """Test case for beta_tester_invitations_create_instance

        
        """
        beta_tester_invitation_create_request = {"data":{"relationships":{"app":{"data":{"id":"id","type":"apps"}},"betaTester":{"data":{"id":"id","type":"betaTesters"}}},"type":"betaTesterInvitations"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesterInvitations',
            method='POST',
            headers=headers,
            data=json.dumps(beta_tester_invitation_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
