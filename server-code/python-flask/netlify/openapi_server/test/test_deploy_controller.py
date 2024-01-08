import unittest

from flask import json

from openapi_server.models.deploy import Deploy  # noqa: E501
from openapi_server.models.deploy_files import DeployFiles  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDeployController(BaseTestCase):
    """DeployController integration test stubs"""

    def test_cancel_site_deploy(self):
        """Test case for cancel_site_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}/cancel'.format(deploy_id='deploy_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_site_deploy(self):
        """Test case for create_site_deploy

        
        """
        deploy = openapi_server.DeployFiles()
        query_string = [('deploy-previews', True),
                        ('production', True),
                        ('state', 'state_example'),
                        ('branch', 'branch_example'),
                        ('latest-published', True),
                        ('title', 'title_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/deploys'.format(site_id='site_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(deploy),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_deploy(self):
        """Test case for delete_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}'.format(deploy_id='deploy_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_site_deploy(self):
        """Test case for delete_site_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/deploys/{deploy_id}'.format(deploy_id='deploy_id_example', site_id='site_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_deploy(self):
        """Test case for get_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}'.format(deploy_id='deploy_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_site_deploy(self):
        """Test case for get_site_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/deploys/{deploy_id}'.format(site_id='site_id_example', deploy_id='deploy_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_deploys(self):
        """Test case for list_site_deploys

        
        """
        query_string = [('deploy-previews', True),
                        ('production', True),
                        ('state', 'state_example'),
                        ('branch', 'branch_example'),
                        ('latest-published', True),
                        ('page', 56),
                        ('per_page', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/deploys'.format(site_id='site_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_lock_deploy(self):
        """Test case for lock_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}/lock'.format(deploy_id='deploy_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_restore_site_deploy(self):
        """Test case for restore_site_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/deploys/{deploy_id}/restore'.format(site_id='site_id_example', deploy_id='deploy_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_rollback_site_deploy(self):
        """Test case for rollback_site_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/rollback'.format(site_id='site_id_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_unlock_deploy(self):
        """Test case for unlock_deploy

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/deploys/{deploy_id}/unlock'.format(deploy_id='deploy_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_site_deploy(self):
        """Test case for update_site_deploy

        
        """
        deploy = openapi_server.DeployFiles()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/deploys/{deploy_id}'.format(site_id='site_id_example', deploy_id='deploy_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(deploy),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
