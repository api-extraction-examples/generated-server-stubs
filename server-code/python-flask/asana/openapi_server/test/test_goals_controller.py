import unittest

from flask import json

from openapi_server.models.add_followers_request import AddFollowersRequest  # noqa: E501
from openapi_server.models.create_goal201_response import CreateGoal201Response  # noqa: E501
from openapi_server.models.create_goal_metric_request import CreateGoalMetricRequest  # noqa: E501
from openapi_server.models.create_goal_request import CreateGoalRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_goals200_response import GetGoals200Response  # noqa: E501
from openapi_server.models.update_goal_metric_request import UpdateGoalMetricRequest  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGoalsController(BaseTestCase):
    """GoalsController integration test stubs"""

    def test_add_followers(self):
        """Test case for add_followers

        Add a collaborator to a goal
        """
        add_followers_request = {"followers":"521621,621373"}
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}/addFollowers'.format(goal_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(add_followers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_goal(self):
        """Test case for create_goal

        Create a goal
        """
        create_goal_request = openapi_server.CreateGoalRequest()
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
            '/api/1.0/goals',
            method='POST',
            headers=headers,
            data=json.dumps(create_goal_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_goal_metric(self):
        """Test case for create_goal_metric

        Create a goal metric
        """
        create_goal_metric_request = openapi_server.CreateGoalMetricRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}/setMetric'.format(goal_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(create_goal_metric_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_goal(self):
        """Test case for delete_goal

        Delete a goal
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}'.format(goal_gid='12345'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goal(self):
        """Test case for get_goal

        Get a goal
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}'.format(goal_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_goals(self):
        """Test case for get_goals

        Get goals
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]']),
                        ('limit', 50),
                        ('offset', 'eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9'),
                        ('portfolio', '159874'),
                        ('project', '512241'),
                        ('is_workspace_level', false),
                        ('team', '31326'),
                        ('workspace', '31326'),
                        ('time_periods', ['221693,506165'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_parent_goals_for_goal(self):
        """Test case for get_parent_goals_for_goal

        Get parent goals from a goal
        """
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}/parentGoals'.format(goal_gid='12345'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_followers(self):
        """Test case for remove_followers

        Remove a collaborator from a goal
        """
        add_followers_request = {"followers":"521621,621373"}
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}/removeFollowers'.format(goal_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(add_followers_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_goal(self):
        """Test case for update_goal

        Update a goal
        """
        create_goal_request = openapi_server.CreateGoalRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}'.format(goal_gid='12345'),
            method='PUT',
            headers=headers,
            data=json.dumps(create_goal_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_goal_metric(self):
        """Test case for update_goal_metric

        Update a goal metric
        """
        update_goal_metric_request = openapi_server.UpdateGoalMetricRequest()
        query_string = [('opt_pretty', true),
                        ('opt_fields', ['[\"followers\",\"assignee\"]'])]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/1.0/goals/{goal_gid}/setMetricCurrentValue'.format(goal_gid='12345'),
            method='POST',
            headers=headers,
            data=json.dumps(update_goal_metric_request),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
