import unittest

from flask import json

from openapi_server.models.authenticate_user_by_name import AuthenticateUserByName  # noqa: E501
from openapi_server.models.authentication_result import AuthenticationResult  # noqa: E501
from openapi_server.models.create_user_by_name import CreateUserByName  # noqa: E501
from openapi_server.models.forgot_password_dto import ForgotPasswordDto  # noqa: E501
from openapi_server.models.forgot_password_result import ForgotPasswordResult  # noqa: E501
from openapi_server.models.pin_redeem_result import PinRedeemResult  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.quick_connect_dto import QuickConnectDto  # noqa: E501
from openapi_server.models.update_user_easy_password import UpdateUserEasyPassword  # noqa: E501
from openapi_server.models.update_user_password import UpdateUserPassword  # noqa: E501
from openapi_server.models.user_configuration import UserConfiguration  # noqa: E501
from openapi_server.models.user_dto import UserDto  # noqa: E501
from openapi_server.models.user_policy import UserPolicy  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserController(BaseTestCase):
    """UserController integration test stubs"""

    def test_authenticate_user(self):
        """Test case for authenticate_user

        Authenticates a user.
        """
        query_string = [('pw', 'pw_example'),
                        ('password', 'password_example')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/{user_id}/Authenticate'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_authenticate_user_by_name(self):
        """Test case for authenticate_user_by_name

        Authenticates a user by name.
        """
        authenticate_user_by_name = {"Username":"Username","Pw":"Pw","Password":"Password"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
        }
        response = self.client.open(
            '/Users/AuthenticateByName',
            method='POST',
            headers=headers,
            data=json.dumps(authenticate_user_by_name),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_authenticate_with_quick_connect(self):
        """Test case for authenticate_with_quick_connect

        Authenticates a user with quick connect.
        """
        quick_connect_dto = {"Token":"Token"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
        }
        response = self.client.open(
            '/Users/AuthenticateWithQuickConnect',
            method='POST',
            headers=headers,
            data=json.dumps(quick_connect_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_create_user_by_name(self):
        """Test case for create_user_by_name

        Creates a user.
        """
        create_user_by_name = {"Name":"Name","Password":"Password"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/New',
            method='POST',
            headers=headers,
            data=json.dumps(create_user_by_name),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_user(self):
        """Test case for delete_user

        Deletes a user.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}'.format(user_id='user_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_forgot_password(self):
        """Test case for forgot_password

        Initiates the forgot password process for a local user.
        """
        forgot_password_dto = {"EnteredUsername":"EnteredUsername"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
        }
        response = self.client.open(
            '/Users/ForgotPassword',
            method='POST',
            headers=headers,
            data=json.dumps(forgot_password_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_forgot_password_pin(self):
        """Test case for forgot_password_pin

        Redeems a forgot password pin.
        """
        body = 'body_example'
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
        }
        response = self.client.open(
            '/Users/ForgotPassword/Pin',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_current_user(self):
        """Test case for get_current_user

        Gets the user based on auth token.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/Me',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_public_users(self):
        """Test case for get_public_users

        Gets a list of publicly visible users for display on a login screen.
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/Users/Public',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_by_id(self):
        """Test case for get_user_by_id

        Gets a user by Id.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_users(self):
        """Test case for get_users

        Gets a list of users.
        """
        query_string = [('isHidden', True),
                        ('isDisabled', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_user(self):
        """Test case for update_user

        Updates a user.
        """
        user_dto = {"Policy":{"EnableContentDeletion":True,"EnableContentDeletionFromFolders":["EnableContentDeletionFromFolders","EnableContentDeletionFromFolders"],"BlockedMediaFolders":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"EnablePlaybackRemuxing":True,"EnabledFolders":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"LoginAttemptsBeforeLockout":5,"IsDisabled":True,"MaxParentalRating":7,"EnablePublicSharing":True,"AccessSchedules":[{"StartHour":1.4658129805029452,"UserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","EndHour":0.8008281904610115,"Id":6},{"StartHour":1.4658129805029452,"UserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","EndHour":0.8008281904610115,"Id":6}],"EnableContentDownloading":True,"ForceRemoteSourceTranscoding":True,"IsAdministrator":True,"BlockedChannels":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"EnableAllDevices":True,"EnabledChannels":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"MaxActiveSessions":2,"EnableMediaConversion":True,"InvalidLoginAttemptCount":5,"EnableLiveTvAccess":True,"EnableAllFolders":True,"EnableRemoteAccess":True,"EnableSharedDeviceControl":True,"IsHidden":True,"EnableLiveTvManagement":True,"BlockUnratedItems":[null,null],"EnableMediaPlayback":True,"EnableVideoPlaybackTranscoding":True,"EnableAllChannels":True,"AuthenticationProviderId":"AuthenticationProviderId","EnableUserPreferenceAccess":True,"BlockedTags":["BlockedTags","BlockedTags"],"EnabledDevices":["EnabledDevices","EnabledDevices"],"EnableRemoteControlOfOtherUsers":True,"PasswordResetProviderId":"PasswordResetProviderId","EnableAudioPlaybackTranscoding":True,"EnableSyncTranscoding":True,"RemoteClientBitrateLimit":9},"HasConfiguredEasyPassword":True,"EnableAutoLogin":True,"Configuration":{"EnableNextEpisodeAutoPlay":True,"SubtitleLanguagePreference":"SubtitleLanguagePreference","DisplayMissingEpisodes":True,"OrderedViews":["OrderedViews","OrderedViews"],"LatestItemsExcludes":["LatestItemsExcludes","LatestItemsExcludes"],"HidePlayedInLatest":True,"EnableLocalPassword":True,"RememberSubtitleSelections":True,"AudioLanguagePreference":"AudioLanguagePreference","DisplayCollectionsView":True,"GroupedFolders":["GroupedFolders","GroupedFolders"],"PlayDefaultAudioTrack":True,"MyMediaExcludes":["MyMediaExcludes","MyMediaExcludes"],"RememberAudioSelections":True},"LastLoginDate":"2000-01-23T04:56:07.000+00:00","PrimaryImageTag":"PrimaryImageTag","Name":"Name","HasConfiguredPassword":True,"ServerId":"ServerId","ServerName":"ServerName","LastActivityDate":"2000-01-23T04:56:07.000+00:00","PrimaryImageAspectRatio":3.616076749251911,"Id":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","HasPassword":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(user_dto),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_user_configuration(self):
        """Test case for update_user_configuration

        Updates a user configuration.
        """
        user_configuration = {"EnableNextEpisodeAutoPlay":True,"SubtitleLanguagePreference":"SubtitleLanguagePreference","DisplayMissingEpisodes":True,"OrderedViews":["OrderedViews","OrderedViews"],"LatestItemsExcludes":["LatestItemsExcludes","LatestItemsExcludes"],"HidePlayedInLatest":True,"EnableLocalPassword":True,"RememberSubtitleSelections":True,"AudioLanguagePreference":"AudioLanguagePreference","DisplayCollectionsView":True,"GroupedFolders":["GroupedFolders","GroupedFolders"],"PlayDefaultAudioTrack":True,"MyMediaExcludes":["MyMediaExcludes","MyMediaExcludes"],"RememberAudioSelections":True}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Configuration'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(user_configuration),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_user_easy_password(self):
        """Test case for update_user_easy_password

        Updates a user's easy password.
        """
        update_user_easy_password = {"NewPassword":"NewPassword","ResetPassword":True,"NewPw":"NewPw"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/EasyPassword'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(update_user_easy_password),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_user_password(self):
        """Test case for update_user_password

        Updates a user's password.
        """
        update_user_password = {"ResetPassword":True,"CurrentPw":"CurrentPw","CurrentPassword":"CurrentPassword","NewPw":"NewPw"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Password'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(update_user_password),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_update_user_policy(self):
        """Test case for update_user_policy

        Updates a user policy.
        """
        user_policy = {"EnableContentDeletion":True,"EnableContentDeletionFromFolders":["EnableContentDeletionFromFolders","EnableContentDeletionFromFolders"],"BlockedMediaFolders":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"EnablePlaybackRemuxing":True,"EnabledFolders":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"LoginAttemptsBeforeLockout":5,"IsDisabled":True,"MaxParentalRating":7,"EnablePublicSharing":True,"AccessSchedules":[{"StartHour":1.4658129805029452,"UserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","EndHour":0.8008281904610115,"Id":6},{"StartHour":1.4658129805029452,"UserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","EndHour":0.8008281904610115,"Id":6}],"EnableContentDownloading":True,"ForceRemoteSourceTranscoding":True,"IsAdministrator":True,"BlockedChannels":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"EnableAllDevices":True,"EnabledChannels":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"MaxActiveSessions":2,"EnableMediaConversion":True,"InvalidLoginAttemptCount":5,"EnableLiveTvAccess":True,"EnableAllFolders":True,"EnableRemoteAccess":True,"EnableSharedDeviceControl":True,"IsHidden":True,"EnableLiveTvManagement":True,"BlockUnratedItems":[null,null],"EnableMediaPlayback":True,"EnableVideoPlaybackTranscoding":True,"EnableAllChannels":True,"AuthenticationProviderId":"AuthenticationProviderId","EnableUserPreferenceAccess":True,"BlockedTags":["BlockedTags","BlockedTags"],"EnabledDevices":["EnabledDevices","EnabledDevices"],"EnableRemoteControlOfOtherUsers":True,"PasswordResetProviderId":"PasswordResetProviderId","EnableAudioPlaybackTranscoding":True,"EnableSyncTranscoding":True,"RemoteClientBitrateLimit":9}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Policy'.format(user_id='user_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(user_policy),
            content_type='application/*+json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
