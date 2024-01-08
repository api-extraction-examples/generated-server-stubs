import connexion
from typing import Dict
from typing import Tuple
from typing import Union

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
from openapi_server import util


def authenticate_user(user_id, pw, password=None):  # noqa: E501
    """Authenticates a user.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param pw: The password as plain text.
    :type pw: str
    :param password: The password sha1-hash.
    :type password: str

    :rtype: Union[AuthenticationResult, Tuple[AuthenticationResult, int], Tuple[AuthenticationResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def authenticate_user_by_name(authenticate_user_by_name):  # noqa: E501
    """Authenticates a user by name.

     # noqa: E501

    :param authenticate_user_by_name: The M:Jellyfin.Api.Controllers.UserController.AuthenticateUserByName(Jellyfin.Api.Models.UserDtos.AuthenticateUserByName) request.
    :type authenticate_user_by_name: dict | bytes

    :rtype: Union[AuthenticationResult, Tuple[AuthenticationResult, int], Tuple[AuthenticationResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        authenticate_user_by_name = AuthenticateUserByName.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def authenticate_with_quick_connect(quick_connect_dto):  # noqa: E501
    """Authenticates a user with quick connect.

     # noqa: E501

    :param quick_connect_dto: The Jellyfin.Api.Models.UserDtos.QuickConnectDto request.
    :type quick_connect_dto: dict | bytes

    :rtype: Union[AuthenticationResult, Tuple[AuthenticationResult, int], Tuple[AuthenticationResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        quick_connect_dto = QuickConnectDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_user_by_name(create_user_by_name):  # noqa: E501
    """Creates a user.

     # noqa: E501

    :param create_user_by_name: The create user by name request body.
    :type create_user_by_name: dict | bytes

    :rtype: Union[UserDto, Tuple[UserDto, int], Tuple[UserDto, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_user_by_name = CreateUserByName.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_user(user_id):  # noqa: E501
    """Deletes a user.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def forgot_password(forgot_password_dto):  # noqa: E501
    """Initiates the forgot password process for a local user.

     # noqa: E501

    :param forgot_password_dto: The forgot password request containing the entered username.
    :type forgot_password_dto: dict | bytes

    :rtype: Union[ForgotPasswordResult, Tuple[ForgotPasswordResult, int], Tuple[ForgotPasswordResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        forgot_password_dto = ForgotPasswordDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def forgot_password_pin(body=None):  # noqa: E501
    """Redeems a forgot password pin.

     # noqa: E501

    :param body: The pin.
    :type body: str

    :rtype: Union[PinRedeemResult, Tuple[PinRedeemResult, int], Tuple[PinRedeemResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_current_user():  # noqa: E501
    """Gets the user based on auth token.

     # noqa: E501


    :rtype: Union[UserDto, Tuple[UserDto, int], Tuple[UserDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_public_users():  # noqa: E501
    """Gets a list of publicly visible users for display on a login screen.

     # noqa: E501


    :rtype: Union[List[UserDto], Tuple[List[UserDto], int], Tuple[List[UserDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_by_id(user_id):  # noqa: E501
    """Gets a user by Id.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str

    :rtype: Union[UserDto, Tuple[UserDto, int], Tuple[UserDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_users(is_hidden=None, is_disabled=None):  # noqa: E501
    """Gets a list of users.

     # noqa: E501

    :param is_hidden: Optional filter by IsHidden&#x3D;true or false.
    :type is_hidden: bool
    :param is_disabled: Optional filter by IsDisabled&#x3D;true or false.
    :type is_disabled: bool

    :rtype: Union[List[UserDto], Tuple[List[UserDto], int], Tuple[List[UserDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def update_user(user_id, user_dto):  # noqa: E501
    """Updates a user.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param user_dto: The updated user model.
    :type user_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_dto = UserDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_user_configuration(user_id, user_configuration):  # noqa: E501
    """Updates a user configuration.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param user_configuration: The new user configuration.
    :type user_configuration: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_configuration = UserConfiguration.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_user_easy_password(user_id, update_user_easy_password):  # noqa: E501
    """Updates a user&#39;s easy password.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param update_user_easy_password: The M:Jellyfin.Api.Controllers.UserController.UpdateUserEasyPassword(System.Guid,Jellyfin.Api.Models.UserDtos.UpdateUserEasyPassword) request.
    :type update_user_easy_password: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_user_easy_password = UpdateUserEasyPassword.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_user_password(user_id, update_user_password):  # noqa: E501
    """Updates a user&#39;s password.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param update_user_password: The M:Jellyfin.Api.Controllers.UserController.UpdateUserPassword(System.Guid,Jellyfin.Api.Models.UserDtos.UpdateUserPassword) request.
    :type update_user_password: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_user_password = UpdateUserPassword.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_user_policy(user_id, user_policy):  # noqa: E501
    """Updates a user policy.

     # noqa: E501

    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param user_policy: The new user policy.
    :type user_policy: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        user_policy = UserPolicy.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
