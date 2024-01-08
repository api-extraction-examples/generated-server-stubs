from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.deploy_site_capabilities import DeploySiteCapabilities
from openapi_server.models.function_schedule import FunctionSchedule
from openapi_server import util

from openapi_server.models.deploy_site_capabilities import DeploySiteCapabilities  # noqa: E501
from openapi_server.models.function_schedule import FunctionSchedule  # noqa: E501

class Deploy(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, admin_url=None, branch=None, build_id=None, commit_ref=None, commit_url=None, context=None, created_at=None, deploy_ssl_url=None, deploy_url=None, draft=None, error_message=None, framework=None, function_schedules=None, id=None, locked=None, name=None, published_at=None, required=None, required_functions=None, review_id=None, review_url=None, screenshot_url=None, site_capabilities=None, site_id=None, skipped=None, ssl_url=None, state=None, title=None, updated_at=None, url=None, user_id=None):  # noqa: E501
        """Deploy - a model defined in OpenAPI

        :param admin_url: The admin_url of this Deploy.  # noqa: E501
        :type admin_url: str
        :param branch: The branch of this Deploy.  # noqa: E501
        :type branch: str
        :param build_id: The build_id of this Deploy.  # noqa: E501
        :type build_id: str
        :param commit_ref: The commit_ref of this Deploy.  # noqa: E501
        :type commit_ref: str
        :param commit_url: The commit_url of this Deploy.  # noqa: E501
        :type commit_url: str
        :param context: The context of this Deploy.  # noqa: E501
        :type context: str
        :param created_at: The created_at of this Deploy.  # noqa: E501
        :type created_at: str
        :param deploy_ssl_url: The deploy_ssl_url of this Deploy.  # noqa: E501
        :type deploy_ssl_url: str
        :param deploy_url: The deploy_url of this Deploy.  # noqa: E501
        :type deploy_url: str
        :param draft: The draft of this Deploy.  # noqa: E501
        :type draft: bool
        :param error_message: The error_message of this Deploy.  # noqa: E501
        :type error_message: str
        :param framework: The framework of this Deploy.  # noqa: E501
        :type framework: str
        :param function_schedules: The function_schedules of this Deploy.  # noqa: E501
        :type function_schedules: List[FunctionSchedule]
        :param id: The id of this Deploy.  # noqa: E501
        :type id: str
        :param locked: The locked of this Deploy.  # noqa: E501
        :type locked: bool
        :param name: The name of this Deploy.  # noqa: E501
        :type name: str
        :param published_at: The published_at of this Deploy.  # noqa: E501
        :type published_at: str
        :param required: The required of this Deploy.  # noqa: E501
        :type required: List[str]
        :param required_functions: The required_functions of this Deploy.  # noqa: E501
        :type required_functions: List[str]
        :param review_id: The review_id of this Deploy.  # noqa: E501
        :type review_id: float
        :param review_url: The review_url of this Deploy.  # noqa: E501
        :type review_url: str
        :param screenshot_url: The screenshot_url of this Deploy.  # noqa: E501
        :type screenshot_url: str
        :param site_capabilities: The site_capabilities of this Deploy.  # noqa: E501
        :type site_capabilities: DeploySiteCapabilities
        :param site_id: The site_id of this Deploy.  # noqa: E501
        :type site_id: str
        :param skipped: The skipped of this Deploy.  # noqa: E501
        :type skipped: bool
        :param ssl_url: The ssl_url of this Deploy.  # noqa: E501
        :type ssl_url: str
        :param state: The state of this Deploy.  # noqa: E501
        :type state: str
        :param title: The title of this Deploy.  # noqa: E501
        :type title: str
        :param updated_at: The updated_at of this Deploy.  # noqa: E501
        :type updated_at: str
        :param url: The url of this Deploy.  # noqa: E501
        :type url: str
        :param user_id: The user_id of this Deploy.  # noqa: E501
        :type user_id: str
        """
        self.openapi_types = {
            'admin_url': str,
            'branch': str,
            'build_id': str,
            'commit_ref': str,
            'commit_url': str,
            'context': str,
            'created_at': str,
            'deploy_ssl_url': str,
            'deploy_url': str,
            'draft': bool,
            'error_message': str,
            'framework': str,
            'function_schedules': List[FunctionSchedule],
            'id': str,
            'locked': bool,
            'name': str,
            'published_at': str,
            'required': List[str],
            'required_functions': List[str],
            'review_id': float,
            'review_url': str,
            'screenshot_url': str,
            'site_capabilities': DeploySiteCapabilities,
            'site_id': str,
            'skipped': bool,
            'ssl_url': str,
            'state': str,
            'title': str,
            'updated_at': str,
            'url': str,
            'user_id': str
        }

        self.attribute_map = {
            'admin_url': 'admin_url',
            'branch': 'branch',
            'build_id': 'build_id',
            'commit_ref': 'commit_ref',
            'commit_url': 'commit_url',
            'context': 'context',
            'created_at': 'created_at',
            'deploy_ssl_url': 'deploy_ssl_url',
            'deploy_url': 'deploy_url',
            'draft': 'draft',
            'error_message': 'error_message',
            'framework': 'framework',
            'function_schedules': 'function_schedules',
            'id': 'id',
            'locked': 'locked',
            'name': 'name',
            'published_at': 'published_at',
            'required': 'required',
            'required_functions': 'required_functions',
            'review_id': 'review_id',
            'review_url': 'review_url',
            'screenshot_url': 'screenshot_url',
            'site_capabilities': 'site_capabilities',
            'site_id': 'site_id',
            'skipped': 'skipped',
            'ssl_url': 'ssl_url',
            'state': 'state',
            'title': 'title',
            'updated_at': 'updated_at',
            'url': 'url',
            'user_id': 'user_id'
        }

        self._admin_url = admin_url
        self._branch = branch
        self._build_id = build_id
        self._commit_ref = commit_ref
        self._commit_url = commit_url
        self._context = context
        self._created_at = created_at
        self._deploy_ssl_url = deploy_ssl_url
        self._deploy_url = deploy_url
        self._draft = draft
        self._error_message = error_message
        self._framework = framework
        self._function_schedules = function_schedules
        self._id = id
        self._locked = locked
        self._name = name
        self._published_at = published_at
        self._required = required
        self._required_functions = required_functions
        self._review_id = review_id
        self._review_url = review_url
        self._screenshot_url = screenshot_url
        self._site_capabilities = site_capabilities
        self._site_id = site_id
        self._skipped = skipped
        self._ssl_url = ssl_url
        self._state = state
        self._title = title
        self._updated_at = updated_at
        self._url = url
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'Deploy':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The deploy of this Deploy.  # noqa: E501
        :rtype: Deploy
        """
        return util.deserialize_model(dikt, cls)

    @property
    def admin_url(self) -> str:
        """Gets the admin_url of this Deploy.


        :return: The admin_url of this Deploy.
        :rtype: str
        """
        return self._admin_url

    @admin_url.setter
    def admin_url(self, admin_url: str):
        """Sets the admin_url of this Deploy.


        :param admin_url: The admin_url of this Deploy.
        :type admin_url: str
        """

        self._admin_url = admin_url

    @property
    def branch(self) -> str:
        """Gets the branch of this Deploy.


        :return: The branch of this Deploy.
        :rtype: str
        """
        return self._branch

    @branch.setter
    def branch(self, branch: str):
        """Sets the branch of this Deploy.


        :param branch: The branch of this Deploy.
        :type branch: str
        """

        self._branch = branch

    @property
    def build_id(self) -> str:
        """Gets the build_id of this Deploy.


        :return: The build_id of this Deploy.
        :rtype: str
        """
        return self._build_id

    @build_id.setter
    def build_id(self, build_id: str):
        """Sets the build_id of this Deploy.


        :param build_id: The build_id of this Deploy.
        :type build_id: str
        """

        self._build_id = build_id

    @property
    def commit_ref(self) -> str:
        """Gets the commit_ref of this Deploy.


        :return: The commit_ref of this Deploy.
        :rtype: str
        """
        return self._commit_ref

    @commit_ref.setter
    def commit_ref(self, commit_ref: str):
        """Sets the commit_ref of this Deploy.


        :param commit_ref: The commit_ref of this Deploy.
        :type commit_ref: str
        """

        self._commit_ref = commit_ref

    @property
    def commit_url(self) -> str:
        """Gets the commit_url of this Deploy.


        :return: The commit_url of this Deploy.
        :rtype: str
        """
        return self._commit_url

    @commit_url.setter
    def commit_url(self, commit_url: str):
        """Sets the commit_url of this Deploy.


        :param commit_url: The commit_url of this Deploy.
        :type commit_url: str
        """

        self._commit_url = commit_url

    @property
    def context(self) -> str:
        """Gets the context of this Deploy.


        :return: The context of this Deploy.
        :rtype: str
        """
        return self._context

    @context.setter
    def context(self, context: str):
        """Sets the context of this Deploy.


        :param context: The context of this Deploy.
        :type context: str
        """

        self._context = context

    @property
    def created_at(self) -> str:
        """Gets the created_at of this Deploy.


        :return: The created_at of this Deploy.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this Deploy.


        :param created_at: The created_at of this Deploy.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def deploy_ssl_url(self) -> str:
        """Gets the deploy_ssl_url of this Deploy.


        :return: The deploy_ssl_url of this Deploy.
        :rtype: str
        """
        return self._deploy_ssl_url

    @deploy_ssl_url.setter
    def deploy_ssl_url(self, deploy_ssl_url: str):
        """Sets the deploy_ssl_url of this Deploy.


        :param deploy_ssl_url: The deploy_ssl_url of this Deploy.
        :type deploy_ssl_url: str
        """

        self._deploy_ssl_url = deploy_ssl_url

    @property
    def deploy_url(self) -> str:
        """Gets the deploy_url of this Deploy.


        :return: The deploy_url of this Deploy.
        :rtype: str
        """
        return self._deploy_url

    @deploy_url.setter
    def deploy_url(self, deploy_url: str):
        """Sets the deploy_url of this Deploy.


        :param deploy_url: The deploy_url of this Deploy.
        :type deploy_url: str
        """

        self._deploy_url = deploy_url

    @property
    def draft(self) -> bool:
        """Gets the draft of this Deploy.


        :return: The draft of this Deploy.
        :rtype: bool
        """
        return self._draft

    @draft.setter
    def draft(self, draft: bool):
        """Sets the draft of this Deploy.


        :param draft: The draft of this Deploy.
        :type draft: bool
        """

        self._draft = draft

    @property
    def error_message(self) -> str:
        """Gets the error_message of this Deploy.


        :return: The error_message of this Deploy.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message: str):
        """Sets the error_message of this Deploy.


        :param error_message: The error_message of this Deploy.
        :type error_message: str
        """

        self._error_message = error_message

    @property
    def framework(self) -> str:
        """Gets the framework of this Deploy.


        :return: The framework of this Deploy.
        :rtype: str
        """
        return self._framework

    @framework.setter
    def framework(self, framework: str):
        """Sets the framework of this Deploy.


        :param framework: The framework of this Deploy.
        :type framework: str
        """

        self._framework = framework

    @property
    def function_schedules(self) -> List[FunctionSchedule]:
        """Gets the function_schedules of this Deploy.


        :return: The function_schedules of this Deploy.
        :rtype: List[FunctionSchedule]
        """
        return self._function_schedules

    @function_schedules.setter
    def function_schedules(self, function_schedules: List[FunctionSchedule]):
        """Sets the function_schedules of this Deploy.


        :param function_schedules: The function_schedules of this Deploy.
        :type function_schedules: List[FunctionSchedule]
        """

        self._function_schedules = function_schedules

    @property
    def id(self) -> str:
        """Gets the id of this Deploy.


        :return: The id of this Deploy.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Deploy.


        :param id: The id of this Deploy.
        :type id: str
        """

        self._id = id

    @property
    def locked(self) -> bool:
        """Gets the locked of this Deploy.


        :return: The locked of this Deploy.
        :rtype: bool
        """
        return self._locked

    @locked.setter
    def locked(self, locked: bool):
        """Sets the locked of this Deploy.


        :param locked: The locked of this Deploy.
        :type locked: bool
        """

        self._locked = locked

    @property
    def name(self) -> str:
        """Gets the name of this Deploy.


        :return: The name of this Deploy.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Deploy.


        :param name: The name of this Deploy.
        :type name: str
        """

        self._name = name

    @property
    def published_at(self) -> str:
        """Gets the published_at of this Deploy.


        :return: The published_at of this Deploy.
        :rtype: str
        """
        return self._published_at

    @published_at.setter
    def published_at(self, published_at: str):
        """Sets the published_at of this Deploy.


        :param published_at: The published_at of this Deploy.
        :type published_at: str
        """

        self._published_at = published_at

    @property
    def required(self) -> List[str]:
        """Gets the required of this Deploy.


        :return: The required of this Deploy.
        :rtype: List[str]
        """
        return self._required

    @required.setter
    def required(self, required: List[str]):
        """Sets the required of this Deploy.


        :param required: The required of this Deploy.
        :type required: List[str]
        """

        self._required = required

    @property
    def required_functions(self) -> List[str]:
        """Gets the required_functions of this Deploy.


        :return: The required_functions of this Deploy.
        :rtype: List[str]
        """
        return self._required_functions

    @required_functions.setter
    def required_functions(self, required_functions: List[str]):
        """Sets the required_functions of this Deploy.


        :param required_functions: The required_functions of this Deploy.
        :type required_functions: List[str]
        """

        self._required_functions = required_functions

    @property
    def review_id(self) -> float:
        """Gets the review_id of this Deploy.


        :return: The review_id of this Deploy.
        :rtype: float
        """
        return self._review_id

    @review_id.setter
    def review_id(self, review_id: float):
        """Sets the review_id of this Deploy.


        :param review_id: The review_id of this Deploy.
        :type review_id: float
        """

        self._review_id = review_id

    @property
    def review_url(self) -> str:
        """Gets the review_url of this Deploy.


        :return: The review_url of this Deploy.
        :rtype: str
        """
        return self._review_url

    @review_url.setter
    def review_url(self, review_url: str):
        """Sets the review_url of this Deploy.


        :param review_url: The review_url of this Deploy.
        :type review_url: str
        """

        self._review_url = review_url

    @property
    def screenshot_url(self) -> str:
        """Gets the screenshot_url of this Deploy.


        :return: The screenshot_url of this Deploy.
        :rtype: str
        """
        return self._screenshot_url

    @screenshot_url.setter
    def screenshot_url(self, screenshot_url: str):
        """Sets the screenshot_url of this Deploy.


        :param screenshot_url: The screenshot_url of this Deploy.
        :type screenshot_url: str
        """

        self._screenshot_url = screenshot_url

    @property
    def site_capabilities(self) -> DeploySiteCapabilities:
        """Gets the site_capabilities of this Deploy.


        :return: The site_capabilities of this Deploy.
        :rtype: DeploySiteCapabilities
        """
        return self._site_capabilities

    @site_capabilities.setter
    def site_capabilities(self, site_capabilities: DeploySiteCapabilities):
        """Sets the site_capabilities of this Deploy.


        :param site_capabilities: The site_capabilities of this Deploy.
        :type site_capabilities: DeploySiteCapabilities
        """

        self._site_capabilities = site_capabilities

    @property
    def site_id(self) -> str:
        """Gets the site_id of this Deploy.


        :return: The site_id of this Deploy.
        :rtype: str
        """
        return self._site_id

    @site_id.setter
    def site_id(self, site_id: str):
        """Sets the site_id of this Deploy.


        :param site_id: The site_id of this Deploy.
        :type site_id: str
        """

        self._site_id = site_id

    @property
    def skipped(self) -> bool:
        """Gets the skipped of this Deploy.


        :return: The skipped of this Deploy.
        :rtype: bool
        """
        return self._skipped

    @skipped.setter
    def skipped(self, skipped: bool):
        """Sets the skipped of this Deploy.


        :param skipped: The skipped of this Deploy.
        :type skipped: bool
        """

        self._skipped = skipped

    @property
    def ssl_url(self) -> str:
        """Gets the ssl_url of this Deploy.


        :return: The ssl_url of this Deploy.
        :rtype: str
        """
        return self._ssl_url

    @ssl_url.setter
    def ssl_url(self, ssl_url: str):
        """Sets the ssl_url of this Deploy.


        :param ssl_url: The ssl_url of this Deploy.
        :type ssl_url: str
        """

        self._ssl_url = ssl_url

    @property
    def state(self) -> str:
        """Gets the state of this Deploy.


        :return: The state of this Deploy.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state: str):
        """Sets the state of this Deploy.


        :param state: The state of this Deploy.
        :type state: str
        """

        self._state = state

    @property
    def title(self) -> str:
        """Gets the title of this Deploy.


        :return: The title of this Deploy.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this Deploy.


        :param title: The title of this Deploy.
        :type title: str
        """

        self._title = title

    @property
    def updated_at(self) -> str:
        """Gets the updated_at of this Deploy.


        :return: The updated_at of this Deploy.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """Sets the updated_at of this Deploy.


        :param updated_at: The updated_at of this Deploy.
        :type updated_at: str
        """

        self._updated_at = updated_at

    @property
    def url(self) -> str:
        """Gets the url of this Deploy.


        :return: The url of this Deploy.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this Deploy.


        :param url: The url of this Deploy.
        :type url: str
        """

        self._url = url

    @property
    def user_id(self) -> str:
        """Gets the user_id of this Deploy.


        :return: The user_id of this Deploy.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this Deploy.


        :param user_id: The user_id of this Deploy.
        :type user_id: str
        """

        self._user_id = user_id
