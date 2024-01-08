import unittest

from flask import json

from openapi_server.models.patch_operation import PatchOperation  # noqa: E501
from openapi_server.models.post_user_segment_request import PostUserSegmentRequest  # noqa: E501
from openapi_server.models.semantic_patch_operation import SemanticPatchOperation  # noqa: E501
from openapi_server.models.update_big_segment_targets_request import UpdateBigSegmentTargetsRequest  # noqa: E501
from openapi_server.models.user_segment import UserSegment  # noqa: E501
from openapi_server.models.user_segments import UserSegments  # noqa: E501
from openapi_server.models.user_targeting_expiration_for_segment import UserTargetingExpirationForSegment  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserSegmentsController(BaseTestCase):
    """UserSegmentsController integration test stubs"""

    def test_delete_user_segment(self):
        """Test case for delete_user_segment

        Delete a user segment.
        """
        headers = { 
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{environment_key}/{user_segment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_segment_key='user_segment_key_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_expiring_user_targets_on_segment(self):
        """Test case for get_expiring_user_targets_on_segment

        Get expiring user targets for user segment
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{user_segment_key}/expiring-user-targets/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_segment_key='user_segment_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_segment(self):
        """Test case for get_user_segment

        Get a single user segment by key.
        """
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{environment_key}/{user_segment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_segment_key='user_segment_key_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_segments(self):
        """Test case for get_user_segments

        Get a list of all user segments in the given project.
        """
        query_string = [('tag', 'tag_example')]
        headers = { 
            'Accept': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_expiring_user_targets_on_segment(self):
        """Test case for patch_expiring_user_targets_on_segment

        Update, add, or delete expiring user targets on user segment
        """
        semantic_patch_with_comment = {"instructions":[{"kind":"removeUserTargets"},{"kind":"removeUserTargets"}],"comment":"This is a comment string"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{user_segment_key}/expiring-user-targets/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_segment_key='user_segment_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(semantic_patch_with_comment),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_user_segment(self):
        """Test case for patch_user_segment

        Perform a partial update to a user segment.
        """
        patch_only = {"op":"replace","path":"/name","value":"My resource name"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{environment_key}/{user_segment_key}'.format(project_key='project_key_example', environment_key='environment_key_example', user_segment_key='user_segment_key_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(patch_only),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_user_segment(self):
        """Test case for post_user_segment

        Creates a new user segment.
        """
        user_segment_body = openapi_server.PostUserSegmentRequest()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{environment_key}'.format(project_key='project_key_example', environment_key='environment_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(user_segment_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_big_segment_targets(self):
        """Test case for update_big_segment_targets

        Update targets included or excluded in a big segment
        """
        big_segment_targets_body = openapi_server.UpdateBigSegmentTargetsRequest()
        headers = { 
            'Content-Type': 'application/json',
            'Token': 'special-key',
        }
        response = self.client.open(
            '/api/v2/segments/{project_key}/{environment_key}/{user_segment_key}/users'.format(project_key='project_key_example', environment_key='environment_key_example', user_segment_key='user_segment_key_example'),
            method='POST',
            headers=headers,
            data=json.dumps(big_segment_targets_body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
