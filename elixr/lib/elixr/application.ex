defmodule Elixr.Application do
  use Application

  @impl true
  def start(_type, _args) do
    children = [
      {Plug.Cowboy, scheme: :http, plug: Elixr.Router, options: [port: port()]}
    ]

    opts = [strategy: :one_for_one, name: Elixr.Supervisor]
    Supervisor.start_link(children, opts)
  end

  defp port do
    case System.get_env("PORT") do
      nil ->
        8080

      value ->
        case Integer.parse(value) do
          {port, ""} -> port
          _ -> 8080
        end
    end
  end
end