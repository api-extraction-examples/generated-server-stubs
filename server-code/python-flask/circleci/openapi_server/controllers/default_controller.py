import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.artifact import Artifact  # noqa: E501
from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.build_detail import BuildDetail  # noqa: E501
from openapi_server.models.build_summary import BuildSummary  # noqa: E501
from openapi_server.models.envvar import Envvar  # noqa: E501
from openapi_server.models.key import Key  # noqa: E501
from openapi_server.models.project import Project  # noqa: E501
from openapi_server.models.project_username_project_build_cache_delete200_response import ProjectUsernameProjectBuildCacheDelete200Response  # noqa: E501
from openapi_server.models.project_username_project_checkout_key_fingerprint_delete200_response import ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response  # noqa: E501
from openapi_server.models.project_username_project_post_request import ProjectUsernameProjectPostRequest  # noqa: E501
from openapi_server.models.project_username_project_ssh_key_post_default_response import ProjectUsernameProjectSshKeyPostDefaultResponse  # noqa: E501
from openapi_server.models.project_username_project_ssh_key_post_request import ProjectUsernameProjectSshKeyPostRequest  # noqa: E501
from openapi_server.models.project_username_project_tree_branch_post_request import ProjectUsernameProjectTreeBranchPostRequest  # noqa: E501
from openapi_server.models.tests import Tests  # noqa: E501
from openapi_server.models.user import User  # noqa: E501
from openapi_server import util


def me_get():  # noqa: E501
    """me_get

    Provides information about the signed in user.  # noqa: E501


    :rtype: Union[User, Tuple[User, int], Tuple[User, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_build_cache_delete(username, project):  # noqa: E501
    """project_username_project_build_cache_delete

    Clears the cache for a project.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str

    :rtype: Union[ProjectUsernameProjectBuildCacheDelete200Response, Tuple[ProjectUsernameProjectBuildCacheDelete200Response, int], Tuple[ProjectUsernameProjectBuildCacheDelete200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_build_num_artifacts_get(username, project, build_num):  # noqa: E501
    """project_username_project_build_num_artifacts_get

    List the artifacts produced by a given build.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param build_num: XXXXXXXXXX 
    :type build_num: int

    :rtype: Union[List[Artifact], Tuple[List[Artifact], int], Tuple[List[Artifact], int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_build_num_cancel_post(username, project, build_num):  # noqa: E501
    """project_username_project_build_num_cancel_post

    Cancels the build, returns a summary of the build.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param build_num: XXXXXXXXXX 
    :type build_num: int

    :rtype: Union[Build, Tuple[Build, int], Tuple[Build, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_build_num_get(username, project, build_num):  # noqa: E501
    """project_username_project_build_num_get

    Full details for a single build. The response includes all of the fields from the build summary. This is also the payload for the [notification webhooks](/docs/configuration/#notify), in which case this object is the value to a key named &#39;payload&#39;.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param build_num: XXXXXXXXXX 
    :type build_num: int

    :rtype: Union[BuildDetail, Tuple[BuildDetail, int], Tuple[BuildDetail, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_build_num_retry_post(username, project, build_num):  # noqa: E501
    """project_username_project_build_num_retry_post

    Retries the build, returns a summary of the new build.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param build_num: XXXXXXXXXX 
    :type build_num: int

    :rtype: Union[Build, Tuple[Build, int], Tuple[Build, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_build_num_tests_get(username, project, build_num):  # noqa: E501
    """project_username_project_build_num_tests_get

    Provides test metadata for a build Note: [Learn how to set up your builds to collect test metadata](https://circleci.com/docs/test-metadata/)  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param build_num: XXXXXXXXXX 
    :type build_num: int

    :rtype: Union[Tests, Tuple[Tests, int], Tuple[Tests, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_checkout_key_fingerprint_delete(username, project, fingerprint):  # noqa: E501
    """project_username_project_checkout_key_fingerprint_delete

    Delete a checkout key.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param fingerprint: XXXXXXXXXX 
    :type fingerprint: str

    :rtype: Union[ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response, Tuple[ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response, int], Tuple[ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_checkout_key_fingerprint_get(username, project, fingerprint):  # noqa: E501
    """project_username_project_checkout_key_fingerprint_get

    Get a checkout key.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param fingerprint: XXXXXXXXXX 
    :type fingerprint: str

    :rtype: Union[Key, Tuple[Key, int], Tuple[Key, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_checkout_key_get(username, project):  # noqa: E501
    """project_username_project_checkout_key_get

    Lists checkout keys.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str

    :rtype: Union[List[Key], Tuple[List[Key], int], Tuple[List[Key], int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_checkout_key_post(username, project, body=None):  # noqa: E501
    """project_username_project_checkout_key_post

    Creates a new checkout key. Only usable with a user API token.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param body: The type of key to create. Can be &#39;deploy-key&#39; or &#39;github-user-key&#39;. 
    :type body: str

    :rtype: Union[Key, Tuple[Key, int], Tuple[Key, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_envvar_get(username, project):  # noqa: E501
    """project_username_project_envvar_get

    Lists the environment variables for :project  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str

    :rtype: Union[List[Envvar], Tuple[List[Envvar], int], Tuple[List[Envvar], int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_envvar_name_delete(username, project, name):  # noqa: E501
    """project_username_project_envvar_name_delete

    Deletes the environment variable named &#39;:name&#39;  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param name: XXXXXXXXXX 
    :type name: str

    :rtype: Union[ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response, Tuple[ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response, int], Tuple[ProjectUsernameProjectCheckoutKeyFingerprintDelete200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_envvar_name_get(username, project, name):  # noqa: E501
    """project_username_project_envvar_name_get

    Gets the hidden value of environment variable :name  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param name: XXXXXXXXXX 
    :type name: str

    :rtype: Union[Envvar, Tuple[Envvar, int], Tuple[Envvar, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_envvar_post(username, project):  # noqa: E501
    """project_username_project_envvar_post

    Creates a new environment variable  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str

    :rtype: Union[Envvar, Tuple[Envvar, int], Tuple[Envvar, int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_get(username, project, limit=None, offset=None, filter=None):  # noqa: E501
    """project_username_project_get

    Build summary for each of the last 30 builds for a single git repo.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param limit: The number of builds to return. Maximum 100, defaults to 30. 
    :type limit: int
    :param offset: The API returns builds starting from this offset, defaults to 0. 
    :type offset: int
    :param filter: Restricts which builds are returned. Set to \&quot;completed\&quot;, \&quot;successful\&quot;, \&quot;failed\&quot;, \&quot;running\&quot;, or defaults to no filter. 
    :type filter: str

    :rtype: Union[List[Build], Tuple[List[Build], int], Tuple[List[Build], int, Dict[str, str]]
    """
    return 'do some magic!'


def project_username_project_post(username, project, project_username_project_post_request=None):  # noqa: E501
    """project_username_project_post

    Triggers a new build, returns a summary of the build.  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param project_username_project_post_request: 
    :type project_username_project_post_request: dict | bytes

    :rtype: Union[BuildSummary, Tuple[BuildSummary, int], Tuple[BuildSummary, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_username_project_post_request = ProjectUsernameProjectPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def project_username_project_ssh_key_post(username, project, content_type, project_username_project_ssh_key_post_request):  # noqa: E501
    """project_username_project_ssh_key_post

    Create an ssh key used to access external systems that require SSH key-based authentication  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param content_type: 
    :type content_type: str
    :param project_username_project_ssh_key_post_request: 
    :type project_username_project_ssh_key_post_request: dict | bytes

    :rtype: Union[ProjectUsernameProjectSshKeyPostDefaultResponse, Tuple[ProjectUsernameProjectSshKeyPostDefaultResponse, int], Tuple[ProjectUsernameProjectSshKeyPostDefaultResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_username_project_ssh_key_post_request = ProjectUsernameProjectSshKeyPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def project_username_project_tree_branch_post(username, project, branch, project_username_project_tree_branch_post_request=None):  # noqa: E501
    """project_username_project_tree_branch_post

    Triggers a new build, returns a summary of the build. Optional build parameters can be set using an experimental API.  Note: For more about build parameters, read about [using parameterized builds](https://circleci.com/docs/parameterized-builds/)  # noqa: E501

    :param username: XXXXXXXXX 
    :type username: str
    :param project: XXXXXXXXX 
    :type project: str
    :param branch: The branch name should be url-encoded. 
    :type branch: str
    :param project_username_project_tree_branch_post_request: 
    :type project_username_project_tree_branch_post_request: dict | bytes

    :rtype: Union[Build, Tuple[Build, int], Tuple[Build, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_username_project_tree_branch_post_request = ProjectUsernameProjectTreeBranchPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def projects_get():  # noqa: E501
    """projects_get

    List of all the projects you&#39;re following on CircleCI, with build information organized by branch.  # noqa: E501


    :rtype: Union[List[Project], Tuple[List[Project], int], Tuple[List[Project], int, Dict[str, str]]
    """
    return 'do some magic!'


def recent_builds_get(limit=None, offset=None):  # noqa: E501
    """recent_builds_get

    Build summary for each of the last 30 recent builds, ordered by build_num.  # noqa: E501

    :param limit: The number of builds to return. Maximum 100, defaults to 30. 
    :type limit: int
    :param offset: The API returns builds starting from this offset, defaults to 0. 
    :type offset: int

    :rtype: Union[List[Build], Tuple[List[Build], int], Tuple[List[Build], int, Dict[str, str]]
    """
    return 'do some magic!'


def user_heroku_key_post():  # noqa: E501
    """user_heroku_key_post

    Adds your Heroku API key to CircleCI, takes apikey as form param name.  # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
