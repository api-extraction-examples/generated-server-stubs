import unittest

from flask import json

from openapi_server.models.container_of_workflow_scheme_associations import ContainerOfWorkflowSchemeAssociations  # noqa: E501
from openapi_server.models.workflow_scheme_project_association import WorkflowSchemeProjectAssociation  # noqa: E501
from openapi_server.test import BaseTestCase


class TestWorkflowSchemeProjectAssociationsController(BaseTestCase):
    """WorkflowSchemeProjectAssociationsController integration test stubs"""

    def test_assign_scheme_to_project(self):
        """Test case for assign_scheme_to_project

        Assign workflow scheme to project
        """
        workflow_scheme_project_association = {"workflowSchemeId":"workflowSchemeId","projectId":"projectId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/project',
            method='PUT',
            headers=headers,
            data=json.dumps(workflow_scheme_project_association),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_workflow_scheme_project_associations(self):
        """Test case for get_workflow_scheme_project_associations

        Get workflow scheme project associations
        """
        query_string = [('projectId', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/workflowscheme/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
