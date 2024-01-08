import unittest

from flask import json

from openapi_server.models.add_supporting_relationship_request import AddSupportingRelationshipRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_goal_relationship200_response import GetGoalRelationship200Response  # noqa: E501
from openapi_server.models.get_goal_relationships200_response import GetGoalRelationships200Response  # noqa: E501
from openapi_server.models.remove_supporting_relationship_request import RemoveSupportingRelationshipRequest  # noqa: E501
from openapi_server.models.update_goal_relationship_request import UpdateGoalRelationshipRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGoalRelationshipsController(BaseTestCase):
    """GoalRelationshipsController integration test stubs"""

    def test_add_supporting_relationship(self):
        """Test case for add_supporting_relationship

        Add a supporting goal relationship
        """
        add_supporting_relationship_request = openapi_server.AddSupportingRelationshipRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}/addSupportingRelationship'.format(goal_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(add_supporting_relationship_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goal_relationship(self):
        """Test case for get_goal_relationship

        Get a goal relationship
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goal_relationships/{goal_relationship_gid}'.format(goal_relationship_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goal_relationships(self):
        """Test case for get_goal_relationships

        Get goal relationships
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('supported_goal', '12345'),
                        ('resource_subtype', 'subgoal')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goal_relationships',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_supporting_relationship(self):
        """Test case for remove_supporting_relationship

        Removes a supporting goal relationship
        """
        remove_supporting_relationship_request = openapi_server.RemoveSupportingRelationshipRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}/removeSupportingRelationship'.format(goal_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(remove_supporting_relationship_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_goal_relationship(self):
        """Test case for update_goal_relationship

        Update a goal relationship
        """
        update_goal_relationship_request = openapi_server.UpdateGoalRelationshipRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goal_relationships/{goal_relationship_gid}'.format(goal_relationship_gid='12345'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_goal_relationship_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
