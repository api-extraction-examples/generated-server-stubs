import unittest

from flask import json

from openapi_server.models.deployed_branch import DeployedBranch  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDeployedBranchController(BaseTestCase):
    """DeployedBranchController integration test stubs"""

    def test_list_site_deployed_branches(self):
        """Test case for list_site_deployed_branches

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/deployed-branches'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
